def reverseWords(s):
    """
    :type s: str
    :rtype: str
    """
    output = []
    this = ""
    for i in range(len(s)):
        if s[i] != " ":
            this = this+s[i]
            print(this)
        else:
            if(this != "") # "" needs to be removed
                output.append(this)
            this = ""
    if(this != "")
    output.append(this)
    print(output)
    final = ""
    for i in range(len(output)):
        if i != len(output)-1:
            final = final + output[len(output)-1-i] + " "
        else: final = final + output[len(output)-1-i]
    return final
print(reverseWords("  hello world  "))
    
                
