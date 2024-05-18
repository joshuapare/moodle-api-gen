# CoreUserGetUsersByFieldRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Field** | **string** | the search field can be                     &#39;id&#39; or &#39;idnumber&#39; or &#39;username&#39; or &#39;email&#39; | [default to "null"]
**Values** | **[]map[string]interface{}** |  | 

## Methods

### NewCoreUserGetUsersByFieldRequest

`func NewCoreUserGetUsersByFieldRequest(field string, values []map[string]interface{}, ) *CoreUserGetUsersByFieldRequest`

NewCoreUserGetUsersByFieldRequest instantiates a new CoreUserGetUsersByFieldRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreUserGetUsersByFieldRequestWithDefaults

`func NewCoreUserGetUsersByFieldRequestWithDefaults() *CoreUserGetUsersByFieldRequest`

NewCoreUserGetUsersByFieldRequestWithDefaults instantiates a new CoreUserGetUsersByFieldRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetField

`func (o *CoreUserGetUsersByFieldRequest) GetField() string`

GetField returns the Field field if non-nil, zero value otherwise.

### GetFieldOk

`func (o *CoreUserGetUsersByFieldRequest) GetFieldOk() (*string, bool)`

GetFieldOk returns a tuple with the Field field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetField

`func (o *CoreUserGetUsersByFieldRequest) SetField(v string)`

SetField sets Field field to given value.


### GetValues

`func (o *CoreUserGetUsersByFieldRequest) GetValues() []map[string]interface{}`

GetValues returns the Values field if non-nil, zero value otherwise.

### GetValuesOk

`func (o *CoreUserGetUsersByFieldRequest) GetValuesOk() (*[]map[string]interface{}, bool)`

GetValuesOk returns a tuple with the Values field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetValues

`func (o *CoreUserGetUsersByFieldRequest) SetValues(v []map[string]interface{})`

SetValues sets Values field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


