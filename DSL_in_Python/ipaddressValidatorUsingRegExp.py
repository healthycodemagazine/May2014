def is_ip(ip_address_string): 
    match = re.match(r"^(d{1,3}).(d{1,3}).(d{1,3}).(d{1,3})$", ip_address_string) 
    if not match: return False 
    for component in match.groups(): 
        if int(component) > 255: return False 
    return True 
