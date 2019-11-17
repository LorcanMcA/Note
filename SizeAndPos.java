public class SizeAndPos {

    private float _x,_y, _sizeX, _sizeY;

    public SizeAndPos(){
        _x = 100;
        _y = 100;
        _sizeX = 100;
        _sizeY = 100;
    }

    public SizeAndPos(float x, float y, float sizeX, float sizeY){
        _x = x;
        _y = y;
        _sizeX = sizeX;
        _sizeY = sizeY;
    }

    //region Accessors
    public float get_x() {
        return _x;
    }

    public float get_y() {
        return _y;
    }

    public float get_sizeX() {
        return _sizeX;
    }

    public float get_sizeY() {
        return _sizeY;
    }

    public String getPos(){
        String s = "X: "+_x+" Y: "+_y;
        return s;
    }
    //endregion


    //region Mutator's
    public void set_sizeX(float sizeX) {
        if(sizeX < 0)
            this._sizeX = sizeX;
        else
            this._sizeX = sizeX;
    }

    public void set_sizeY(float sizeY) {
        if(sizeY < 0)
            this._sizeY = sizeY;
        else
            this._sizeY = sizeY;
    }

    public void set_x(float x) {
        if(x < 0){
            _x=0;
        }else {
            this._x = x;
        }
    }

    public void set_y(float y) {
        if(y < 0){
            _y=0;
        }else {
            this._y = y;
        }
    }
    //endregion
}
