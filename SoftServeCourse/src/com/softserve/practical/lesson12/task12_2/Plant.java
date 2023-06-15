package practical.lesson12.task12_2;

    public class Plant {
        private Type type;
        private Color color;
        private int size;

        public Plant(String type, String color, int size) throws ColorException, TypeException {
            Color c = colorStrToEnum(color);
            Type t = typeStrToEnum(type);
            this.size = size;
            this.type = t;
            this.color = c;
        }

        private Color colorStrToEnum(String color) throws ColorException {
            return switch (color.toLowerCase()) {
                case "blue" -> Color.BLUE;
                case "red" -> Color.RED;
                case "white" -> Color.WHITE;
                default -> throw new ColorException("Input only color blue, red or white");
            };
        }

        private Type typeStrToEnum(String type) throws TypeException {
            return switch ((type.toLowerCase())) {
                case "rose" -> Type.ROSE;
                case "lily" -> Type.LILY;
                case "iris" -> Type.IRIS;
                case "orchids" -> Type.ORCHIDS;
                default -> throw new TypeException("Input only type: rose,lily,iris or orchids");
            };
        }

        @Override
        public String toString() {
            return "Plant{" +
                    "type=" + type +
                    ", color=" + color +
                    ", size=" + size +
                    '}';
        }
    }
