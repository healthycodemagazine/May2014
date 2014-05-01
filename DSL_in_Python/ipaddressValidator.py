def is_ip(ip_address): 
    components = ip_address_string.split(".") 
    if len(components) != 4: return False 
    try: 
        int_components = [int(component) for component in components] 
    except ValueError: 
        return False 
    for component in int_components: 
        if component < 0 or component > 255: return False 
    return True 
