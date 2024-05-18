# CoreUserSetUserPreferences200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Saved** | [**[]CoreUserSetUserPreferences200ResponseSavedInner**](CoreUserSetUserPreferences200ResponseSavedInner.md) |  | 
**Warnings** | Pointer to [**[]AuthEmailSignupUser200ResponseWarningsInner**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Methods

### NewCoreUserSetUserPreferences200Response

`func NewCoreUserSetUserPreferences200Response(saved []CoreUserSetUserPreferences200ResponseSavedInner, ) *CoreUserSetUserPreferences200Response`

NewCoreUserSetUserPreferences200Response instantiates a new CoreUserSetUserPreferences200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreUserSetUserPreferences200ResponseWithDefaults

`func NewCoreUserSetUserPreferences200ResponseWithDefaults() *CoreUserSetUserPreferences200Response`

NewCoreUserSetUserPreferences200ResponseWithDefaults instantiates a new CoreUserSetUserPreferences200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetSaved

`func (o *CoreUserSetUserPreferences200Response) GetSaved() []CoreUserSetUserPreferences200ResponseSavedInner`

GetSaved returns the Saved field if non-nil, zero value otherwise.

### GetSavedOk

`func (o *CoreUserSetUserPreferences200Response) GetSavedOk() (*[]CoreUserSetUserPreferences200ResponseSavedInner, bool)`

GetSavedOk returns a tuple with the Saved field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSaved

`func (o *CoreUserSetUserPreferences200Response) SetSaved(v []CoreUserSetUserPreferences200ResponseSavedInner)`

SetSaved sets Saved field to given value.


### GetWarnings

`func (o *CoreUserSetUserPreferences200Response) GetWarnings() []AuthEmailSignupUser200ResponseWarningsInner`

GetWarnings returns the Warnings field if non-nil, zero value otherwise.

### GetWarningsOk

`func (o *CoreUserSetUserPreferences200Response) GetWarningsOk() (*[]AuthEmailSignupUser200ResponseWarningsInner, bool)`

GetWarningsOk returns a tuple with the Warnings field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWarnings

`func (o *CoreUserSetUserPreferences200Response) SetWarnings(v []AuthEmailSignupUser200ResponseWarningsInner)`

SetWarnings sets Warnings field to given value.

### HasWarnings

`func (o *CoreUserSetUserPreferences200Response) HasWarnings() bool`

HasWarnings returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


