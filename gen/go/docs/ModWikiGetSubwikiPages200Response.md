# ModWikiGetSubwikiPages200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Pages** | [**[]ModWikiGetSubwikiPages200ResponsePagesInner**](ModWikiGetSubwikiPages200ResponsePagesInner.md) |  | 
**Warnings** | Pointer to [**[]AuthEmailSignupUser200ResponseWarningsInner**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Methods

### NewModWikiGetSubwikiPages200Response

`func NewModWikiGetSubwikiPages200Response(pages []ModWikiGetSubwikiPages200ResponsePagesInner, ) *ModWikiGetSubwikiPages200Response`

NewModWikiGetSubwikiPages200Response instantiates a new ModWikiGetSubwikiPages200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModWikiGetSubwikiPages200ResponseWithDefaults

`func NewModWikiGetSubwikiPages200ResponseWithDefaults() *ModWikiGetSubwikiPages200Response`

NewModWikiGetSubwikiPages200ResponseWithDefaults instantiates a new ModWikiGetSubwikiPages200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetPages

`func (o *ModWikiGetSubwikiPages200Response) GetPages() []ModWikiGetSubwikiPages200ResponsePagesInner`

GetPages returns the Pages field if non-nil, zero value otherwise.

### GetPagesOk

`func (o *ModWikiGetSubwikiPages200Response) GetPagesOk() (*[]ModWikiGetSubwikiPages200ResponsePagesInner, bool)`

GetPagesOk returns a tuple with the Pages field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPages

`func (o *ModWikiGetSubwikiPages200Response) SetPages(v []ModWikiGetSubwikiPages200ResponsePagesInner)`

SetPages sets Pages field to given value.


### GetWarnings

`func (o *ModWikiGetSubwikiPages200Response) GetWarnings() []AuthEmailSignupUser200ResponseWarningsInner`

GetWarnings returns the Warnings field if non-nil, zero value otherwise.

### GetWarningsOk

`func (o *ModWikiGetSubwikiPages200Response) GetWarningsOk() (*[]AuthEmailSignupUser200ResponseWarningsInner, bool)`

GetWarningsOk returns a tuple with the Warnings field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWarnings

`func (o *ModWikiGetSubwikiPages200Response) SetWarnings(v []AuthEmailSignupUser200ResponseWarningsInner)`

SetWarnings sets Warnings field to given value.

### HasWarnings

`func (o *ModWikiGetSubwikiPages200Response) HasWarnings() bool`

HasWarnings returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


