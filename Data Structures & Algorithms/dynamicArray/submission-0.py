class DynamicArray:
    
    def __init__(self, capacity: int):
        self.capacity = capacity
        self.arr = [None] * capacity
        self.size = 0


    def get(self, i: int) -> int:
        return self.arr[i]

    def set(self, i: int, n: int) -> None:
        self.arr[i] = n

    def pushback(self, n: int) -> None:
        if self.size == self.capacity:
            self.resize()
        self.arr[self.size] = n
        self.size += 1

    def popback(self) -> int:
        self.size -= 1
        val = self.arr[self.size]
        self.arr[self.size] = None
        return val

    def resize(self) -> None:
        new_arr = [None] * (self.capacity * 2) 

        for i in range(self.size):
            new_arr[i] = self.arr[i]

        self.arr = new_arr
        self.capacity *= 2

    def getSize(self) -> int:
        return self.size
    
    def getCapacity(self) -> int:
        return self.capacity