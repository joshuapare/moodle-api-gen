# CoreGradesGetGradableUsers200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Users** | [**[]CoreGradesGetGradableUsers200ResponseUsersInner**](CoreGradesGetGradableUsers200ResponseUsersInner.md) |  | 
**Warnings** | Pointer to [**[]AuthEmailSignupUser200ResponseWarningsInner**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Methods

### NewCoreGradesGetGradableUsers200Response

`func NewCoreGradesGetGradableUsers200Response(users []CoreGradesGetGradableUsers200ResponseUsersInner, ) *CoreGradesGetGradableUsers200Response`

NewCoreGradesGetGradableUsers200Response instantiates a new CoreGradesGetGradableUsers200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreGradesGetGradableUsers200ResponseWithDefaults

`func NewCoreGradesGetGradableUsers200ResponseWithDefaults() *CoreGradesGetGradableUsers200Response`

NewCoreGradesGetGradableUsers200ResponseWithDefaults instantiates a new CoreGradesGetGradableUsers200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetUsers

`func (o *CoreGradesGetGradableUsers200Response) GetUsers() []CoreGradesGetGradableUsers200ResponseUsersInner`

GetUsers returns the Users field if non-nil, zero value otherwise.

### GetUsersOk

`func (o *CoreGradesGetGradableUsers200Response) GetUsersOk() (*[]CoreGradesGetGradableUsers200ResponseUsersInner, bool)`

GetUsersOk returns a tuple with the Users field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUsers

`func (o *CoreGradesGetGradableUsers200Response) SetUsers(v []CoreGradesGetGradableUsers200ResponseUsersInner)`

SetUsers sets Users field to given value.


### GetWarnings

`func (o *CoreGradesGetGradableUsers200Response) GetWarnings() []AuthEmailSignupUser200ResponseWarningsInner`

GetWarnings returns the Warnings field if non-nil, zero value otherwise.

### GetWarningsOk

`func (o *CoreGradesGetGradableUsers200Response) GetWarningsOk() (*[]AuthEmailSignupUser200ResponseWarningsInner, bool)`

GetWarningsOk returns a tuple with the Warnings field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWarnings

`func (o *CoreGradesGetGradableUsers200Response) SetWarnings(v []AuthEmailSignupUser200ResponseWarningsInner)`

SetWarnings sets Warnings field to given value.

### HasWarnings

`func (o *CoreGradesGetGradableUsers200Response) HasWarnings() bool`

HasWarnings returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


