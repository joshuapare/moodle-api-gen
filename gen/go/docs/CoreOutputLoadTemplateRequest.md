# CoreOutputLoadTemplateRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Component** | **string** | component containing the template | [default to "null"]
**Includecomments** | Pointer to **bool** | Include comments or not | [optional] [default to false]
**Template** | **string** | name of the template | [default to "null"]
**Themename** | **string** | The current theme. | [default to "null"]

## Methods

### NewCoreOutputLoadTemplateRequest

`func NewCoreOutputLoadTemplateRequest(component string, template string, themename string, ) *CoreOutputLoadTemplateRequest`

NewCoreOutputLoadTemplateRequest instantiates a new CoreOutputLoadTemplateRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreOutputLoadTemplateRequestWithDefaults

`func NewCoreOutputLoadTemplateRequestWithDefaults() *CoreOutputLoadTemplateRequest`

NewCoreOutputLoadTemplateRequestWithDefaults instantiates a new CoreOutputLoadTemplateRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetComponent

`func (o *CoreOutputLoadTemplateRequest) GetComponent() string`

GetComponent returns the Component field if non-nil, zero value otherwise.

### GetComponentOk

`func (o *CoreOutputLoadTemplateRequest) GetComponentOk() (*string, bool)`

GetComponentOk returns a tuple with the Component field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetComponent

`func (o *CoreOutputLoadTemplateRequest) SetComponent(v string)`

SetComponent sets Component field to given value.


### GetIncludecomments

`func (o *CoreOutputLoadTemplateRequest) GetIncludecomments() bool`

GetIncludecomments returns the Includecomments field if non-nil, zero value otherwise.

### GetIncludecommentsOk

`func (o *CoreOutputLoadTemplateRequest) GetIncludecommentsOk() (*bool, bool)`

GetIncludecommentsOk returns a tuple with the Includecomments field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIncludecomments

`func (o *CoreOutputLoadTemplateRequest) SetIncludecomments(v bool)`

SetIncludecomments sets Includecomments field to given value.

### HasIncludecomments

`func (o *CoreOutputLoadTemplateRequest) HasIncludecomments() bool`

HasIncludecomments returns a boolean if a field has been set.

### GetTemplate

`func (o *CoreOutputLoadTemplateRequest) GetTemplate() string`

GetTemplate returns the Template field if non-nil, zero value otherwise.

### GetTemplateOk

`func (o *CoreOutputLoadTemplateRequest) GetTemplateOk() (*string, bool)`

GetTemplateOk returns a tuple with the Template field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTemplate

`func (o *CoreOutputLoadTemplateRequest) SetTemplate(v string)`

SetTemplate sets Template field to given value.


### GetThemename

`func (o *CoreOutputLoadTemplateRequest) GetThemename() string`

GetThemename returns the Themename field if non-nil, zero value otherwise.

### GetThemenameOk

`func (o *CoreOutputLoadTemplateRequest) GetThemenameOk() (*string, bool)`

GetThemenameOk returns a tuple with the Themename field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetThemename

`func (o *CoreOutputLoadTemplateRequest) SetThemename(v string)`

SetThemename sets Themename field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


