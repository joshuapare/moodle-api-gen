# ModScormGetScormUserData200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Data** | [**[]ModScormGetScormUserData200ResponseDataInner**](ModScormGetScormUserData200ResponseDataInner.md) |  | 
**Warnings** | Pointer to [**[]AuthEmailSignupUser200ResponseWarningsInner**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Methods

### NewModScormGetScormUserData200Response

`func NewModScormGetScormUserData200Response(data []ModScormGetScormUserData200ResponseDataInner, ) *ModScormGetScormUserData200Response`

NewModScormGetScormUserData200Response instantiates a new ModScormGetScormUserData200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModScormGetScormUserData200ResponseWithDefaults

`func NewModScormGetScormUserData200ResponseWithDefaults() *ModScormGetScormUserData200Response`

NewModScormGetScormUserData200ResponseWithDefaults instantiates a new ModScormGetScormUserData200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetData

`func (o *ModScormGetScormUserData200Response) GetData() []ModScormGetScormUserData200ResponseDataInner`

GetData returns the Data field if non-nil, zero value otherwise.

### GetDataOk

`func (o *ModScormGetScormUserData200Response) GetDataOk() (*[]ModScormGetScormUserData200ResponseDataInner, bool)`

GetDataOk returns a tuple with the Data field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetData

`func (o *ModScormGetScormUserData200Response) SetData(v []ModScormGetScormUserData200ResponseDataInner)`

SetData sets Data field to given value.


### GetWarnings

`func (o *ModScormGetScormUserData200Response) GetWarnings() []AuthEmailSignupUser200ResponseWarningsInner`

GetWarnings returns the Warnings field if non-nil, zero value otherwise.

### GetWarningsOk

`func (o *ModScormGetScormUserData200Response) GetWarningsOk() (*[]AuthEmailSignupUser200ResponseWarningsInner, bool)`

GetWarningsOk returns a tuple with the Warnings field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWarnings

`func (o *ModScormGetScormUserData200Response) SetWarnings(v []AuthEmailSignupUser200ResponseWarningsInner)`

SetWarnings sets Warnings field to given value.

### HasWarnings

`func (o *ModScormGetScormUserData200Response) HasWarnings() bool`

HasWarnings returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


