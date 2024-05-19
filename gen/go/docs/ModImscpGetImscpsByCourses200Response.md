# ModImscpGetImscpsByCourses200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Imscps** | [**[]ModImscpGetImscpsByCourses200ResponseImscpsInner**](ModImscpGetImscpsByCourses200ResponseImscpsInner.md) |  | 
**Warnings** | Pointer to [**[]AuthEmailSignupUser200ResponseWarningsInner**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Methods

### NewModImscpGetImscpsByCourses200Response

`func NewModImscpGetImscpsByCourses200Response(imscps []ModImscpGetImscpsByCourses200ResponseImscpsInner, ) *ModImscpGetImscpsByCourses200Response`

NewModImscpGetImscpsByCourses200Response instantiates a new ModImscpGetImscpsByCourses200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModImscpGetImscpsByCourses200ResponseWithDefaults

`func NewModImscpGetImscpsByCourses200ResponseWithDefaults() *ModImscpGetImscpsByCourses200Response`

NewModImscpGetImscpsByCourses200ResponseWithDefaults instantiates a new ModImscpGetImscpsByCourses200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetImscps

`func (o *ModImscpGetImscpsByCourses200Response) GetImscps() []ModImscpGetImscpsByCourses200ResponseImscpsInner`

GetImscps returns the Imscps field if non-nil, zero value otherwise.

### GetImscpsOk

`func (o *ModImscpGetImscpsByCourses200Response) GetImscpsOk() (*[]ModImscpGetImscpsByCourses200ResponseImscpsInner, bool)`

GetImscpsOk returns a tuple with the Imscps field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetImscps

`func (o *ModImscpGetImscpsByCourses200Response) SetImscps(v []ModImscpGetImscpsByCourses200ResponseImscpsInner)`

SetImscps sets Imscps field to given value.


### GetWarnings

`func (o *ModImscpGetImscpsByCourses200Response) GetWarnings() []AuthEmailSignupUser200ResponseWarningsInner`

GetWarnings returns the Warnings field if non-nil, zero value otherwise.

### GetWarningsOk

`func (o *ModImscpGetImscpsByCourses200Response) GetWarningsOk() (*[]AuthEmailSignupUser200ResponseWarningsInner, bool)`

GetWarningsOk returns a tuple with the Warnings field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWarnings

`func (o *ModImscpGetImscpsByCourses200Response) SetWarnings(v []AuthEmailSignupUser200ResponseWarningsInner)`

SetWarnings sets Warnings field to given value.

### HasWarnings

`func (o *ModImscpGetImscpsByCourses200Response) HasWarnings() bool`

HasWarnings returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


