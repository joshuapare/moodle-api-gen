# CoreFormDynamicForm200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Data** | Pointer to **string** | JSON-encoded return data from form processing method | [optional] [default to "null"]
**Html** | Pointer to **string** | HTML fragment of the form | [optional] [default to "null"]
**Javascript** | Pointer to **string** | JavaScript fragment of the form | [optional] [default to "null"]
**Submitted** | **bool** | If form was submitted and validated | [default to null]

## Methods

### NewCoreFormDynamicForm200Response

`func NewCoreFormDynamicForm200Response(submitted bool, ) *CoreFormDynamicForm200Response`

NewCoreFormDynamicForm200Response instantiates a new CoreFormDynamicForm200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreFormDynamicForm200ResponseWithDefaults

`func NewCoreFormDynamicForm200ResponseWithDefaults() *CoreFormDynamicForm200Response`

NewCoreFormDynamicForm200ResponseWithDefaults instantiates a new CoreFormDynamicForm200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetData

`func (o *CoreFormDynamicForm200Response) GetData() string`

GetData returns the Data field if non-nil, zero value otherwise.

### GetDataOk

`func (o *CoreFormDynamicForm200Response) GetDataOk() (*string, bool)`

GetDataOk returns a tuple with the Data field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetData

`func (o *CoreFormDynamicForm200Response) SetData(v string)`

SetData sets Data field to given value.

### HasData

`func (o *CoreFormDynamicForm200Response) HasData() bool`

HasData returns a boolean if a field has been set.

### GetHtml

`func (o *CoreFormDynamicForm200Response) GetHtml() string`

GetHtml returns the Html field if non-nil, zero value otherwise.

### GetHtmlOk

`func (o *CoreFormDynamicForm200Response) GetHtmlOk() (*string, bool)`

GetHtmlOk returns a tuple with the Html field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetHtml

`func (o *CoreFormDynamicForm200Response) SetHtml(v string)`

SetHtml sets Html field to given value.

### HasHtml

`func (o *CoreFormDynamicForm200Response) HasHtml() bool`

HasHtml returns a boolean if a field has been set.

### GetJavascript

`func (o *CoreFormDynamicForm200Response) GetJavascript() string`

GetJavascript returns the Javascript field if non-nil, zero value otherwise.

### GetJavascriptOk

`func (o *CoreFormDynamicForm200Response) GetJavascriptOk() (*string, bool)`

GetJavascriptOk returns a tuple with the Javascript field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetJavascript

`func (o *CoreFormDynamicForm200Response) SetJavascript(v string)`

SetJavascript sets Javascript field to given value.

### HasJavascript

`func (o *CoreFormDynamicForm200Response) HasJavascript() bool`

HasJavascript returns a boolean if a field has been set.

### GetSubmitted

`func (o *CoreFormDynamicForm200Response) GetSubmitted() bool`

GetSubmitted returns the Submitted field if non-nil, zero value otherwise.

### GetSubmittedOk

`func (o *CoreFormDynamicForm200Response) GetSubmittedOk() (*bool, bool)`

GetSubmittedOk returns a tuple with the Submitted field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSubmitted

`func (o *CoreFormDynamicForm200Response) SetSubmitted(v bool)`

SetSubmitted sets Submitted field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


