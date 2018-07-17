import socket
print("\n\n DNS lookup")
print("1. Url to IP address")
print("2. IP address to URL" )
print("3. Get the host name")
print("Enter your choice")
ch=int(input())
if ch==1:
	urlname=input("Enter the Url")
	IPadder=socket.gethostbyname(urlname)
	print(urlname) 
	print(IPadder) 
	

elif ch==2:
	ipadd=input("Enter the IP address")
	url=socket.gethostbyaddr(ipadd)
	print(ipadd)
	print(url)
	
elif ch==3:
	print("    The host name is")
	ipa=input("Enter the IP of your device")
	name=socket.gethostname()
	print(ipa) 
	print(name)
	
	

	

	
	
  


                                           

