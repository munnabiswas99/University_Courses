class Institution:
    pass

class School(Institution):
    pass

school = School()

# Check if school is an instance of Institution
print(isinstance(school, Institution))  # This should return True
