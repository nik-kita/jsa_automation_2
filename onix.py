import sys
file_name = sys.argv[1]
po_string = '''

public class {file_name} extends OnixPageObject {

}


'''


def create_page_object():
    file = open(file_name + ".java", "w")
    print(file_name)
    print(po_string)
    file.write(po_string)



create_page_object()
