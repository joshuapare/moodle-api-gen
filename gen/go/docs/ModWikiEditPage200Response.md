# ModWikiEditPage200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Pageid** | **int32** | Edited page id. | [default to null]
**Warnings** | Pointer to [**[]AuthEmailSignupUser200ResponseWarningsInner**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Methods

### NewModWikiEditPage200Response

`func NewModWikiEditPage200Response(pageid int32, ) *ModWikiEditPage200Response`

NewModWikiEditPage200Response instantiates a new ModWikiEditPage200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModWikiEditPage200ResponseWithDefaults

`func NewModWikiEditPage200ResponseWithDefaults() *ModWikiEditPage200Response`

NewModWikiEditPage200ResponseWithDefaults instantiates a new ModWikiEditPage200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetPageid

`func (o *ModWikiEditPage200Response) GetPageid() int32`

GetPageid returns the Pageid field if non-nil, zero value otherwise.

### GetPageidOk

`func (o *ModWikiEditPage200Response) GetPageidOk() (*int32, bool)`

GetPageidOk returns a tuple with the Pageid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPageid

`func (o *ModWikiEditPage200Response) SetPageid(v int32)`

SetPageid sets Pageid field to given value.


### GetWarnings

`func (o *ModWikiEditPage200Response) GetWarnings() []AuthEmailSignupUser200ResponseWarningsInner`

GetWarnings returns the Warnings field if non-nil, zero value otherwise.

### GetWarningsOk

`func (o *ModWikiEditPage200Response) GetWarningsOk() (*[]AuthEmailSignupUser200ResponseWarningsInner, bool)`

GetWarningsOk returns a tuple with the Warnings field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWarnings

`func (o *ModWikiEditPage200Response) SetWarnings(v []AuthEmailSignupUser200ResponseWarningsInner)`

SetWarnings sets Warnings field to given value.

### HasWarnings

`func (o *ModWikiEditPage200Response) HasWarnings() bool`

HasWarnings returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


