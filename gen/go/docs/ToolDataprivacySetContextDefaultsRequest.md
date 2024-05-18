# ToolDataprivacySetContextDefaultsRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Activity** | Pointer to **string** | The plugin name of the activity | [optional] 
**Category** | **int32** | The default category for the given context level | [default to null]
**Contextlevel** | **int32** | The context level | [default to null]
**Override** | Pointer to **bool** | Whether to override existing instances with the defaults | [optional] [default to false]
**Purpose** | **int32** | The default purpose for the given context level | [default to null]

## Methods

### NewToolDataprivacySetContextDefaultsRequest

`func NewToolDataprivacySetContextDefaultsRequest(category int32, contextlevel int32, purpose int32, ) *ToolDataprivacySetContextDefaultsRequest`

NewToolDataprivacySetContextDefaultsRequest instantiates a new ToolDataprivacySetContextDefaultsRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewToolDataprivacySetContextDefaultsRequestWithDefaults

`func NewToolDataprivacySetContextDefaultsRequestWithDefaults() *ToolDataprivacySetContextDefaultsRequest`

NewToolDataprivacySetContextDefaultsRequestWithDefaults instantiates a new ToolDataprivacySetContextDefaultsRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetActivity

`func (o *ToolDataprivacySetContextDefaultsRequest) GetActivity() string`

GetActivity returns the Activity field if non-nil, zero value otherwise.

### GetActivityOk

`func (o *ToolDataprivacySetContextDefaultsRequest) GetActivityOk() (*string, bool)`

GetActivityOk returns a tuple with the Activity field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetActivity

`func (o *ToolDataprivacySetContextDefaultsRequest) SetActivity(v string)`

SetActivity sets Activity field to given value.

### HasActivity

`func (o *ToolDataprivacySetContextDefaultsRequest) HasActivity() bool`

HasActivity returns a boolean if a field has been set.

### GetCategory

`func (o *ToolDataprivacySetContextDefaultsRequest) GetCategory() int32`

GetCategory returns the Category field if non-nil, zero value otherwise.

### GetCategoryOk

`func (o *ToolDataprivacySetContextDefaultsRequest) GetCategoryOk() (*int32, bool)`

GetCategoryOk returns a tuple with the Category field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCategory

`func (o *ToolDataprivacySetContextDefaultsRequest) SetCategory(v int32)`

SetCategory sets Category field to given value.


### GetContextlevel

`func (o *ToolDataprivacySetContextDefaultsRequest) GetContextlevel() int32`

GetContextlevel returns the Contextlevel field if non-nil, zero value otherwise.

### GetContextlevelOk

`func (o *ToolDataprivacySetContextDefaultsRequest) GetContextlevelOk() (*int32, bool)`

GetContextlevelOk returns a tuple with the Contextlevel field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetContextlevel

`func (o *ToolDataprivacySetContextDefaultsRequest) SetContextlevel(v int32)`

SetContextlevel sets Contextlevel field to given value.


### GetOverride

`func (o *ToolDataprivacySetContextDefaultsRequest) GetOverride() bool`

GetOverride returns the Override field if non-nil, zero value otherwise.

### GetOverrideOk

`func (o *ToolDataprivacySetContextDefaultsRequest) GetOverrideOk() (*bool, bool)`

GetOverrideOk returns a tuple with the Override field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOverride

`func (o *ToolDataprivacySetContextDefaultsRequest) SetOverride(v bool)`

SetOverride sets Override field to given value.

### HasOverride

`func (o *ToolDataprivacySetContextDefaultsRequest) HasOverride() bool`

HasOverride returns a boolean if a field has been set.

### GetPurpose

`func (o *ToolDataprivacySetContextDefaultsRequest) GetPurpose() int32`

GetPurpose returns the Purpose field if non-nil, zero value otherwise.

### GetPurposeOk

`func (o *ToolDataprivacySetContextDefaultsRequest) GetPurposeOk() (*int32, bool)`

GetPurposeOk returns a tuple with the Purpose field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPurpose

`func (o *ToolDataprivacySetContextDefaultsRequest) SetPurpose(v int32)`

SetPurpose sets Purpose field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


