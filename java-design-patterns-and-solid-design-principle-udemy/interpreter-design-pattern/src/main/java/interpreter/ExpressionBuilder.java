package interpreter;

import java.util.Stack;
import java.util.StringTokenizer;

//Parses & builds abstract syntax tree
public class ExpressionBuilder {
    private Stack<PermissionExpression> permissions = new Stack<>();

    private Stack<String> operators = new Stack<>();

    public PermissionExpression build(Report report) {
        parse(report.getPermission());
        buildExpressions();
        if (permissions.size() > 1 || !operators.isEmpty()) {
            System.out.println("ERROR!");
        }
        return permissions.pop();
    }

    private void parse(String permission) {
        StringTokenizer tokenizer = new StringTokenizer(permission.toLowerCase());
        while (tokenizer.hasMoreTokens()) {
            String token;
            switch ((token = tokenizer.nextToken())) {
                case "and":
                    operators.push("and");
                    break;
                case "not":
                    operators.push("not");
                    break;
                case "or":
                    operators.push("or");
                    break;
                default:
                    permissions.push(new Permission(token));
                    break;
            }
        }
    }

    private void buildExpressions() {
        while (!operators.isEmpty()) {
            String operator = operators.pop();
            PermissionExpression perm1;
            PermissionExpression perm2;
            PermissionExpression exp;
            switch (operator) {
                case "not":
                    perm1 = permissions.pop();
                    exp = new NotExpression(perm1);
                    break;
                case "and":
                    perm1 = permissions.pop();
                    perm2 = permissions.pop();
                    exp = new AndExpression(perm1, perm2);
                    break;
                case "or":
                    perm1 = permissions.pop();
                    perm2 = permissions.pop();
                    exp = new OrExpression(perm1, perm2);
                    break;
                default:
                    throw new IllegalArgumentException("Unknown operator:" + operator);
            }
            permissions.push(exp);
        }
    }
}
