# CoreOutputLoadTemplateWithDependenciesRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Component** | **string** | component containing the template | 
**Includecomments** | Pointer to **bool** | Include comments or not | [optional] [default to false]
**Lang** | Pointer to **string** | lang | [optional] 
**Template** | **string** | name of the template | 
**Themename** | **string** | The current theme. | 

## Methods

### NewCoreOutputLoadTemplateWithDependenciesRequest

`func NewCoreOutputLoadTemplateWithDependenciesRequest(component string, template string, themename string, ) *CoreOutputLoadTemplateWithDependenciesRequest`

NewCoreOutputLoadTemplateWithDependenciesRequest instantiates a new CoreOutputLoadTemplateWithDependenciesRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreOutputLoadTemplateWithDependenciesRequestWithDefaults

`func NewCoreOutputLoadTemplateWithDependenciesRequestWithDefaults() *CoreOutputLoadTemplateWithDependenciesRequest`

NewCoreOutputLoadTemplateWithDependenciesRequestWithDefaults instantiates a new CoreOutputLoadTemplateWithDependenciesRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetComponent

`func (o *CoreOutputLoadTemplateWithDependenciesRequest) GetComponent() string`

GetComponent returns the Component field if non-nil, zero value otherwise.

### GetComponentOk

`func (o *CoreOutputLoadTemplateWithDependenciesRequest) GetComponentOk() (*string, bool)`

GetComponentOk returns a tuple with the Component field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetComponent

`func (o *CoreOutputLoadTemplateWithDependenciesRequest) SetComponent(v string)`

SetComponent sets Component field to given value.


### GetIncludecomments

`func (o *CoreOutputLoadTemplateWithDependenciesRequest) GetIncludecomments() bool`

GetIncludecomments returns the Includecomments field if non-nil, zero value otherwise.

### GetIncludecommentsOk

`func (o *CoreOutputLoadTemplateWithDependenciesRequest) GetIncludecommentsOk() (*bool, bool)`

GetIncludecommentsOk returns a tuple with the Includecomments field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIncludecomments

`func (o *CoreOutputLoadTemplateWithDependenciesRequest) SetIncludecomments(v bool)`

SetIncludecomments sets Includecomments field to given value.

### HasIncludecomments

`func (o *CoreOutputLoadTemplateWithDependenciesRequest) HasIncludecomments() bool`

HasIncludecomments returns a boolean if a field has been set.

### GetLang

`func (o *CoreOutputLoadTemplateWithDependenciesRequest) GetLang() string`

GetLang returns the Lang field if non-nil, zero value otherwise.

### GetLangOk

`func (o *CoreOutputLoadTemplateWithDependenciesRequest) GetLangOk() (*string, bool)`

GetLangOk returns a tuple with the Lang field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLang

`func (o *CoreOutputLoadTemplateWithDependenciesRequest) SetLang(v string)`

SetLang sets Lang field to given value.

### HasLang

`func (o *CoreOutputLoadTemplateWithDependenciesRequest) HasLang() bool`

HasLang returns a boolean if a field has been set.

### GetTemplate

`func (o *CoreOutputLoadTemplateWithDependenciesRequest) GetTemplate() string`

GetTemplate returns the Template field if non-nil, zero value otherwise.

### GetTemplateOk

`func (o *CoreOutputLoadTemplateWithDependenciesRequest) GetTemplateOk() (*string, bool)`

GetTemplateOk returns a tuple with the Template field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTemplate

`func (o *CoreOutputLoadTemplateWithDependenciesRequest) SetTemplate(v string)`

SetTemplate sets Template field to given value.


### GetThemename

`func (o *CoreOutputLoadTemplateWithDependenciesRequest) GetThemename() string`

GetThemename returns the Themename field if non-nil, zero value otherwise.

### GetThemenameOk

`func (o *CoreOutputLoadTemplateWithDependenciesRequest) GetThemenameOk() (*string, bool)`

GetThemenameOk returns a tuple with the Themename field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetThemename

`func (o *CoreOutputLoadTemplateWithDependenciesRequest) SetThemename(v string)`

SetThemename sets Themename field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


