# ModGlossaryGetAuthorsRequestOptions

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Includenotapproved** | Pointer to **bool** | When false, includes self even if all of their entries require approval. When true, also includes authors only having entries pending approval. | [optional] [default to 0]

## Methods

### NewModGlossaryGetAuthorsRequestOptions

`func NewModGlossaryGetAuthorsRequestOptions() *ModGlossaryGetAuthorsRequestOptions`

NewModGlossaryGetAuthorsRequestOptions instantiates a new ModGlossaryGetAuthorsRequestOptions object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModGlossaryGetAuthorsRequestOptionsWithDefaults

`func NewModGlossaryGetAuthorsRequestOptionsWithDefaults() *ModGlossaryGetAuthorsRequestOptions`

NewModGlossaryGetAuthorsRequestOptionsWithDefaults instantiates a new ModGlossaryGetAuthorsRequestOptions object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetIncludenotapproved

`func (o *ModGlossaryGetAuthorsRequestOptions) GetIncludenotapproved() bool`

GetIncludenotapproved returns the Includenotapproved field if non-nil, zero value otherwise.

### GetIncludenotapprovedOk

`func (o *ModGlossaryGetAuthorsRequestOptions) GetIncludenotapprovedOk() (*bool, bool)`

GetIncludenotapprovedOk returns a tuple with the Includenotapproved field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIncludenotapproved

`func (o *ModGlossaryGetAuthorsRequestOptions) SetIncludenotapproved(v bool)`

SetIncludenotapproved sets Includenotapproved field to given value.

### HasIncludenotapproved

`func (o *ModGlossaryGetAuthorsRequestOptions) HasIncludenotapproved() bool`

HasIncludenotapproved returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


