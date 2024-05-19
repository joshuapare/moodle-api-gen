# CoreMessageGetUserMessagePreferences200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Blocknoncontacts** | **int32** | Privacy messaging setting to define who can message you | [default to null]
**Entertosend** | **bool** | User preference for using enter to send messages | [default to null]
**Preferences** | [**CoreMessageGetUserMessagePreferences200ResponsePreferences**](CoreMessageGetUserMessagePreferences200ResponsePreferences.md) |  | 
**Warnings** | Pointer to [**[]AuthEmailSignupUser200ResponseWarningsInner**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Methods

### NewCoreMessageGetUserMessagePreferences200Response

`func NewCoreMessageGetUserMessagePreferences200Response(blocknoncontacts int32, entertosend bool, preferences CoreMessageGetUserMessagePreferences200ResponsePreferences, ) *CoreMessageGetUserMessagePreferences200Response`

NewCoreMessageGetUserMessagePreferences200Response instantiates a new CoreMessageGetUserMessagePreferences200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreMessageGetUserMessagePreferences200ResponseWithDefaults

`func NewCoreMessageGetUserMessagePreferences200ResponseWithDefaults() *CoreMessageGetUserMessagePreferences200Response`

NewCoreMessageGetUserMessagePreferences200ResponseWithDefaults instantiates a new CoreMessageGetUserMessagePreferences200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetBlocknoncontacts

`func (o *CoreMessageGetUserMessagePreferences200Response) GetBlocknoncontacts() int32`

GetBlocknoncontacts returns the Blocknoncontacts field if non-nil, zero value otherwise.

### GetBlocknoncontactsOk

`func (o *CoreMessageGetUserMessagePreferences200Response) GetBlocknoncontactsOk() (*int32, bool)`

GetBlocknoncontactsOk returns a tuple with the Blocknoncontacts field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBlocknoncontacts

`func (o *CoreMessageGetUserMessagePreferences200Response) SetBlocknoncontacts(v int32)`

SetBlocknoncontacts sets Blocknoncontacts field to given value.


### GetEntertosend

`func (o *CoreMessageGetUserMessagePreferences200Response) GetEntertosend() bool`

GetEntertosend returns the Entertosend field if non-nil, zero value otherwise.

### GetEntertosendOk

`func (o *CoreMessageGetUserMessagePreferences200Response) GetEntertosendOk() (*bool, bool)`

GetEntertosendOk returns a tuple with the Entertosend field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEntertosend

`func (o *CoreMessageGetUserMessagePreferences200Response) SetEntertosend(v bool)`

SetEntertosend sets Entertosend field to given value.


### GetPreferences

`func (o *CoreMessageGetUserMessagePreferences200Response) GetPreferences() CoreMessageGetUserMessagePreferences200ResponsePreferences`

GetPreferences returns the Preferences field if non-nil, zero value otherwise.

### GetPreferencesOk

`func (o *CoreMessageGetUserMessagePreferences200Response) GetPreferencesOk() (*CoreMessageGetUserMessagePreferences200ResponsePreferences, bool)`

GetPreferencesOk returns a tuple with the Preferences field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPreferences

`func (o *CoreMessageGetUserMessagePreferences200Response) SetPreferences(v CoreMessageGetUserMessagePreferences200ResponsePreferences)`

SetPreferences sets Preferences field to given value.


### GetWarnings

`func (o *CoreMessageGetUserMessagePreferences200Response) GetWarnings() []AuthEmailSignupUser200ResponseWarningsInner`

GetWarnings returns the Warnings field if non-nil, zero value otherwise.

### GetWarningsOk

`func (o *CoreMessageGetUserMessagePreferences200Response) GetWarningsOk() (*[]AuthEmailSignupUser200ResponseWarningsInner, bool)`

GetWarningsOk returns a tuple with the Warnings field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWarnings

`func (o *CoreMessageGetUserMessagePreferences200Response) SetWarnings(v []AuthEmailSignupUser200ResponseWarningsInner)`

SetWarnings sets Warnings field to given value.

### HasWarnings

`func (o *CoreMessageGetUserMessagePreferences200Response) HasWarnings() bool`

HasWarnings returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


