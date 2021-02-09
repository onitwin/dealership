package carcomponents;

import Enums.EngineType;

public class Engine {

    private EngineType engineType;
    private int engineSize;

    public Engine(EngineType engineType, int engineSize){
        this.engineType = engineType;
        this.engineSize = engineSize;
    }

    public EngineType getEngineType() {
        return engineType;
    }

    public void setEngineType(EngineType engineType) {
        this.engineType = engineType;
    }

    public int getEngineSize() {
        return this.engineSize;
    }

    public void setEngineSize(int engineSize) {
        this.engineSize = engineSize;
    }
}
