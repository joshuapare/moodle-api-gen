# ModScormGetScormsByCourses200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Options** | Pointer to [**[]ModScormGetScormsByCourses200ResponseOptionsInner**](ModScormGetScormsByCourses200ResponseOptionsInner.md) |  | [optional] 
**Scorms** | [**[]ModScormGetScormsByCourses200ResponseScormsInner**](ModScormGetScormsByCourses200ResponseScormsInner.md) |  | 
**Warnings** | Pointer to [**[]AuthEmailSignupUser200ResponseWarningsInner**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Methods

### NewModScormGetScormsByCourses200Response

`func NewModScormGetScormsByCourses200Response(scorms []ModScormGetScormsByCourses200ResponseScormsInner, ) *ModScormGetScormsByCourses200Response`

NewModScormGetScormsByCourses200Response instantiates a new ModScormGetScormsByCourses200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModScormGetScormsByCourses200ResponseWithDefaults

`func NewModScormGetScormsByCourses200ResponseWithDefaults() *ModScormGetScormsByCourses200Response`

NewModScormGetScormsByCourses200ResponseWithDefaults instantiates a new ModScormGetScormsByCourses200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetOptions

`func (o *ModScormGetScormsByCourses200Response) GetOptions() []ModScormGetScormsByCourses200ResponseOptionsInner`

GetOptions returns the Options field if non-nil, zero value otherwise.

### GetOptionsOk

`func (o *ModScormGetScormsByCourses200Response) GetOptionsOk() (*[]ModScormGetScormsByCourses200ResponseOptionsInner, bool)`

GetOptionsOk returns a tuple with the Options field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOptions

`func (o *ModScormGetScormsByCourses200Response) SetOptions(v []ModScormGetScormsByCourses200ResponseOptionsInner)`

SetOptions sets Options field to given value.

### HasOptions

`func (o *ModScormGetScormsByCourses200Response) HasOptions() bool`

HasOptions returns a boolean if a field has been set.

### GetScorms

`func (o *ModScormGetScormsByCourses200Response) GetScorms() []ModScormGetScormsByCourses200ResponseScormsInner`

GetScorms returns the Scorms field if non-nil, zero value otherwise.

### GetScormsOk

`func (o *ModScormGetScormsByCourses200Response) GetScormsOk() (*[]ModScormGetScormsByCourses200ResponseScormsInner, bool)`

GetScormsOk returns a tuple with the Scorms field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetScorms

`func (o *ModScormGetScormsByCourses200Response) SetScorms(v []ModScormGetScormsByCourses200ResponseScormsInner)`

SetScorms sets Scorms field to given value.


### GetWarnings

`func (o *ModScormGetScormsByCourses200Response) GetWarnings() []AuthEmailSignupUser200ResponseWarningsInner`

GetWarnings returns the Warnings field if non-nil, zero value otherwise.

### GetWarningsOk

`func (o *ModScormGetScormsByCourses200Response) GetWarningsOk() (*[]AuthEmailSignupUser200ResponseWarningsInner, bool)`

GetWarningsOk returns a tuple with the Warnings field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWarnings

`func (o *ModScormGetScormsByCourses200Response) SetWarnings(v []AuthEmailSignupUser200ResponseWarningsInner)`

SetWarnings sets Warnings field to given value.

### HasWarnings

`func (o *ModScormGetScormsByCourses200Response) HasWarnings() bool`

HasWarnings returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


