export interface Istudents{
    id:number,
    name:string,
    username:string,
    email:string,
    address:Address,
    phoneno:string,
    university:University,

}

export interface Address{
    streetname:string,
    city:string,
    zipcode:string,

}

export interface University{
    name:string,
    location:string,
}