# ModForumCanAddDiscussion200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Cancreateattachment** | Pointer to **bool** | True if the user can add attachments, false otherwise. | [optional] [default to null]
**Canpindiscussions** | Pointer to **bool** | True if the user can pin discussions, false otherwise. | [optional] [default to null]
**Status** | **bool** | True if the user can add discussions, false otherwise. | [default to null]
**Warnings** | Pointer to [**[]AuthEmailSignupUser200ResponseWarningsInner**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Methods

### NewModForumCanAddDiscussion200Response

`func NewModForumCanAddDiscussion200Response(status bool, ) *ModForumCanAddDiscussion200Response`

NewModForumCanAddDiscussion200Response instantiates a new ModForumCanAddDiscussion200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModForumCanAddDiscussion200ResponseWithDefaults

`func NewModForumCanAddDiscussion200ResponseWithDefaults() *ModForumCanAddDiscussion200Response`

NewModForumCanAddDiscussion200ResponseWithDefaults instantiates a new ModForumCanAddDiscussion200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCancreateattachment

`func (o *ModForumCanAddDiscussion200Response) GetCancreateattachment() bool`

GetCancreateattachment returns the Cancreateattachment field if non-nil, zero value otherwise.

### GetCancreateattachmentOk

`func (o *ModForumCanAddDiscussion200Response) GetCancreateattachmentOk() (*bool, bool)`

GetCancreateattachmentOk returns a tuple with the Cancreateattachment field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCancreateattachment

`func (o *ModForumCanAddDiscussion200Response) SetCancreateattachment(v bool)`

SetCancreateattachment sets Cancreateattachment field to given value.

### HasCancreateattachment

`func (o *ModForumCanAddDiscussion200Response) HasCancreateattachment() bool`

HasCancreateattachment returns a boolean if a field has been set.

### GetCanpindiscussions

`func (o *ModForumCanAddDiscussion200Response) GetCanpindiscussions() bool`

GetCanpindiscussions returns the Canpindiscussions field if non-nil, zero value otherwise.

### GetCanpindiscussionsOk

`func (o *ModForumCanAddDiscussion200Response) GetCanpindiscussionsOk() (*bool, bool)`

GetCanpindiscussionsOk returns a tuple with the Canpindiscussions field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCanpindiscussions

`func (o *ModForumCanAddDiscussion200Response) SetCanpindiscussions(v bool)`

SetCanpindiscussions sets Canpindiscussions field to given value.

### HasCanpindiscussions

`func (o *ModForumCanAddDiscussion200Response) HasCanpindiscussions() bool`

HasCanpindiscussions returns a boolean if a field has been set.

### GetStatus

`func (o *ModForumCanAddDiscussion200Response) GetStatus() bool`

GetStatus returns the Status field if non-nil, zero value otherwise.

### GetStatusOk

`func (o *ModForumCanAddDiscussion200Response) GetStatusOk() (*bool, bool)`

GetStatusOk returns a tuple with the Status field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStatus

`func (o *ModForumCanAddDiscussion200Response) SetStatus(v bool)`

SetStatus sets Status field to given value.


### GetWarnings

`func (o *ModForumCanAddDiscussion200Response) GetWarnings() []AuthEmailSignupUser200ResponseWarningsInner`

GetWarnings returns the Warnings field if non-nil, zero value otherwise.

### GetWarningsOk

`func (o *ModForumCanAddDiscussion200Response) GetWarningsOk() (*[]AuthEmailSignupUser200ResponseWarningsInner, bool)`

GetWarningsOk returns a tuple with the Warnings field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWarnings

`func (o *ModForumCanAddDiscussion200Response) SetWarnings(v []AuthEmailSignupUser200ResponseWarningsInner)`

SetWarnings sets Warnings field to given value.

### HasWarnings

`func (o *ModForumCanAddDiscussion200Response) HasWarnings() bool`

HasWarnings returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


