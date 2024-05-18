# CoreUserSearchIdentity200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**List** | [**[]CoreUserSearchIdentity200ResponseListInner**](CoreUserSearchIdentity200ResponseListInner.md) |  | 
**Maxusersperpage** | **int32** | Configured maximum users per page. | [default to null]
**Overflow** | **bool** | Were there more records than maxusersperpage found? | [default to null]

## Methods

### NewCoreUserSearchIdentity200Response

`func NewCoreUserSearchIdentity200Response(list []CoreUserSearchIdentity200ResponseListInner, maxusersperpage int32, overflow bool, ) *CoreUserSearchIdentity200Response`

NewCoreUserSearchIdentity200Response instantiates a new CoreUserSearchIdentity200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreUserSearchIdentity200ResponseWithDefaults

`func NewCoreUserSearchIdentity200ResponseWithDefaults() *CoreUserSearchIdentity200Response`

NewCoreUserSearchIdentity200ResponseWithDefaults instantiates a new CoreUserSearchIdentity200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetList

`func (o *CoreUserSearchIdentity200Response) GetList() []CoreUserSearchIdentity200ResponseListInner`

GetList returns the List field if non-nil, zero value otherwise.

### GetListOk

`func (o *CoreUserSearchIdentity200Response) GetListOk() (*[]CoreUserSearchIdentity200ResponseListInner, bool)`

GetListOk returns a tuple with the List field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetList

`func (o *CoreUserSearchIdentity200Response) SetList(v []CoreUserSearchIdentity200ResponseListInner)`

SetList sets List field to given value.


### GetMaxusersperpage

`func (o *CoreUserSearchIdentity200Response) GetMaxusersperpage() int32`

GetMaxusersperpage returns the Maxusersperpage field if non-nil, zero value otherwise.

### GetMaxusersperpageOk

`func (o *CoreUserSearchIdentity200Response) GetMaxusersperpageOk() (*int32, bool)`

GetMaxusersperpageOk returns a tuple with the Maxusersperpage field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMaxusersperpage

`func (o *CoreUserSearchIdentity200Response) SetMaxusersperpage(v int32)`

SetMaxusersperpage sets Maxusersperpage field to given value.


### GetOverflow

`func (o *CoreUserSearchIdentity200Response) GetOverflow() bool`

GetOverflow returns the Overflow field if non-nil, zero value otherwise.

### GetOverflowOk

`func (o *CoreUserSearchIdentity200Response) GetOverflowOk() (*bool, bool)`

GetOverflowOk returns a tuple with the Overflow field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOverflow

`func (o *CoreUserSearchIdentity200Response) SetOverflow(v bool)`

SetOverflow sets Overflow field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


