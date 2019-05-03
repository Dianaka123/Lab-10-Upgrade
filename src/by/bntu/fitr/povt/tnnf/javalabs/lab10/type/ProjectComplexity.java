package by.bntu.fitr.povt.tnnf.javalabs.lab10.type;

public enum ProjectComplexity {
        NONE("none"),
        EASY("easy"),
        HARD("hard"),
        MIDDLE("middle");

        private String type;

        ProjectComplexity(String type) {
                this.type = type;
        }

        public String getType() {
                return type;
        }

        public void setType(String type) {
                this.type = type;
        }

        @Override
        public String toString() {
                return "ProjectComplexity{" +
                        "type='" + type + '\'' +
                        '}';
        }
}