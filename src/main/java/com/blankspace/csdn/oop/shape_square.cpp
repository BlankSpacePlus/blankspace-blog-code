#include <iostream>

using namespace std;

class Shape {
public:
    virtual int get_perimeter() = 0;
};

class Square: Shape {
protected:
    int a;
public:
    explicit Square(int a) {
        this->a = a;
    }
    int get_perimeter() override {
        return 4 * a;
    }
};

int main() {
    Square square = Square(2);
    cout << square.get_perimeter() << endl;
    return 0;
}
