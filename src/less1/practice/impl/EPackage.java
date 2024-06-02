package less1.practice.impl;

public enum Package {
    PlASTIC("пластик"), GLASS("стекло");

    private  final  String material;

    Package(String material) {
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }
}
