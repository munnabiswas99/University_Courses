from abc import ABC, abstractmethod


class Mouse(ABC):
    @abstractmethod
    def run(self):
        pass
