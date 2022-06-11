package abstractfactory.aws;

import abstractfactory.Instance;
import abstractfactory.ResourceFactory;

import abstractfactory.Instance.Capacity;
import abstractfactory.Storage;

public class AwsResourceFactory implements ResourceFactory {

    @Override
    public Instance createInstance(Capacity capacity) {
        return new Ec2Instance(capacity);
    }

    @Override
    public Storage createStorage(int capMib) {
        return new S3Storage(capMib);
    }


}
