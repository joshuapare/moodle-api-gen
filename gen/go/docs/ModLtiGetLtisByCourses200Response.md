# ModLtiGetLtisByCourses200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Ltis** | [**[]ModLtiGetLtisByCourses200ResponseLtisInner**](ModLtiGetLtisByCourses200ResponseLtisInner.md) |  | 
**Warnings** | Pointer to [**[]AuthEmailSignupUser200ResponseWarningsInner**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Methods

### NewModLtiGetLtisByCourses200Response

`func NewModLtiGetLtisByCourses200Response(ltis []ModLtiGetLtisByCourses200ResponseLtisInner, ) *ModLtiGetLtisByCourses200Response`

NewModLtiGetLtisByCourses200Response instantiates a new ModLtiGetLtisByCourses200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModLtiGetLtisByCourses200ResponseWithDefaults

`func NewModLtiGetLtisByCourses200ResponseWithDefaults() *ModLtiGetLtisByCourses200Response`

NewModLtiGetLtisByCourses200ResponseWithDefaults instantiates a new ModLtiGetLtisByCourses200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetLtis

`func (o *ModLtiGetLtisByCourses200Response) GetLtis() []ModLtiGetLtisByCourses200ResponseLtisInner`

GetLtis returns the Ltis field if non-nil, zero value otherwise.

### GetLtisOk

`func (o *ModLtiGetLtisByCourses200Response) GetLtisOk() (*[]ModLtiGetLtisByCourses200ResponseLtisInner, bool)`

GetLtisOk returns a tuple with the Ltis field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLtis

`func (o *ModLtiGetLtisByCourses200Response) SetLtis(v []ModLtiGetLtisByCourses200ResponseLtisInner)`

SetLtis sets Ltis field to given value.


### GetWarnings

`func (o *ModLtiGetLtisByCourses200Response) GetWarnings() []AuthEmailSignupUser200ResponseWarningsInner`

GetWarnings returns the Warnings field if non-nil, zero value otherwise.

### GetWarningsOk

`func (o *ModLtiGetLtisByCourses200Response) GetWarningsOk() (*[]AuthEmailSignupUser200ResponseWarningsInner, bool)`

GetWarningsOk returns a tuple with the Warnings field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWarnings

`func (o *ModLtiGetLtisByCourses200Response) SetWarnings(v []AuthEmailSignupUser200ResponseWarningsInner)`

SetWarnings sets Warnings field to given value.

### HasWarnings

`func (o *ModLtiGetLtisByCourses200Response) HasWarnings() bool`

HasWarnings returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


