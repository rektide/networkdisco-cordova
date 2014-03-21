var exec= require("cordova/exec"),
  q= require("q")

var upnp= /^upnp:/,
  zeroconf= /^zeroconf/

module.export.getNetworkServices= function(type){
	var defer= Q.defer()
	if(zeroconf.test(type)){
		cordova.exec(resolve, reject, "NetworkDiscoPlugin" "zeroconf", [type])
	}else if(upnp.test(type)){
		cordova.exec(resolve, reject, "NetworkDiscoPlugin", "upnp", [type])
	}
	return defer.promise
}

function resolve(defer){
	return function(resolve){
		defer.resolve(resolve)
	}
}

function reject(defer){
	return function(reject){
		defer.reject(reject)
	}
}