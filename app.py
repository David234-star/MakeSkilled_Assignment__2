def is_palindrome(string):
    # convert to lowercase and remove non-alphabetic characters
    string = "".join(c.lower() for c in string if c.isalpha())
    # compare to its reverse
    reversed_string = "".join(reversed(string))
    return string == reversed_string

# get user input for the string
user_input = input("Enter a string: ")

# check if the string is a palindrome
if is_palindrome(user_input):
    print(f"{user_input} is a palindrome.")
else:
    print(f"{user_input} is not a palindrome.")
