#include <iostream>

using namespace std;

class Square {
protected:
    int a;
public:
    explicit Square(int a) {
        this->a = a;
    }
    virtual int get_perimeter() const {
        return 4 * a;
    }
};

class Rectangle: Square {
private:
    bool checkRectangle() {
        return this->a != this->b;
    }
protected:
    int b;
public:
    Rectangle(int a, int b) : Square(a) {
        this->a = a;
        this->b = b;
    }
    int get_perimeter() const override {
        return 2 * (a + b);
    }
};

int main() {
    Rectangle rectangle = Rectangle(2, 3);
    cout << rectangle.get_perimeter() << endl;
    return 0;
}
