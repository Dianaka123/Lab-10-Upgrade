package by.bntu.fitr.povt.tnnf.javalabs.lab10.type;

public enum TypeCleaningTool {

    RAG("rag"),
    SWAP("swap"),
    BUCKET("bucket"),
    SOAP("soap");

    private String type;

    TypeCleaningTool(String type){
        this.type = type;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "TypeCleaningTool{" +
                "type='" + type + '\'' +
                '}';
    }
}
