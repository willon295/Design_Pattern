package dp03_builder;

public class ConcretePhoneBuilder extends PhoneBuilder {

    private Phone phone;

    private InnerProductCache cache  = new InnerProductCache();
    @Override
    PhoneBuilder setName(String name) {
        cache.setName(name);
        return this;
    }

    @Override
    PhoneBuilder setId(int id) {
        cache.setId(id);
        return this;
    }

    @Override
    PhoneBuilder setFunction(String func) {
        cache.setFunction(func);
        return this;
    }


    //真正上线
    @Override
    Phone build() {
        phone= new Phone();
        phone.setId(cache.getId());
        phone.setName(cache.getName());
        phone.setFunction(cache.getFunction());
        return phone;
    }


    //产品模型类（缓冲类）
    private class InnerProductCache{
        private String  name;
        private int  id;
        private String function;
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public int getId() {
            return id;
        }
        public void setId(int id) {
            this.id = id;
        }
        public String getFunction() {
            return function;
        }
        public void setFunction(String function) {
            this.function = function;
        }
    }

}
