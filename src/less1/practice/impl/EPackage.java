package less1.practice.impl;

public enum EPackage {
    PlASTIC("пластик"), GLASS("стекло");

    private  final  String material;

    EPackage(String material) {
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }
}
