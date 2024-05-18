# ToolMobileGetConfigRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Section** | Pointer to **string** | Settings section name. | [optional] [default to ""]

## Methods

### NewToolMobileGetConfigRequest

`func NewToolMobileGetConfigRequest() *ToolMobileGetConfigRequest`

NewToolMobileGetConfigRequest instantiates a new ToolMobileGetConfigRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewToolMobileGetConfigRequestWithDefaults

`func NewToolMobileGetConfigRequestWithDefaults() *ToolMobileGetConfigRequest`

NewToolMobileGetConfigRequestWithDefaults instantiates a new ToolMobileGetConfigRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetSection

`func (o *ToolMobileGetConfigRequest) GetSection() string`

GetSection returns the Section field if non-nil, zero value otherwise.

### GetSectionOk

`func (o *ToolMobileGetConfigRequest) GetSectionOk() (*string, bool)`

GetSectionOk returns a tuple with the Section field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSection

`func (o *ToolMobileGetConfigRequest) SetSection(v string)`

SetSection sets Section field to given value.

### HasSection

`func (o *ToolMobileGetConfigRequest) HasSection() bool`

HasSection returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


