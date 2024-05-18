# ModForumGetForumAccessInformation200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Canaddinstance** | Pointer to **bool** | Whether the user has the capability mod/forum:addinstance allowed. | [optional] [default to null]
**Canaddnews** | Pointer to **bool** | Whether the user has the capability mod/forum:addnews allowed. | [optional] [default to null]
**Canaddquestion** | Pointer to **bool** | Whether the user has the capability mod/forum:addquestion allowed. | [optional] [default to null]
**Canallowforcesubscribe** | Pointer to **bool** | Whether the user has the capability mod/forum:allowforcesubscribe allowed. | [optional] [default to null]
**Cancanmailnow** | Pointer to **bool** | Whether the user has the capability mod/forum:canmailnow allowed. | [optional] [default to null]
**Cancanoverridecutoff** | Pointer to **bool** | Whether the user has the capability mod/forum:canoverridecutoff allowed. | [optional] [default to null]
**Cancanoverridediscussionlock** | Pointer to **bool** | Whether the user has the capability mod/forum:canoverridediscussionlock allowed. | [optional] [default to null]
**Cancanposttomygroups** | Pointer to **bool** | Whether the user has the capability mod/forum:canposttomygroups allowed. | [optional] [default to null]
**Cancantogglefavourite** | Pointer to **bool** | Whether the user has the capability mod/forum:cantogglefavourite allowed. | [optional] [default to null]
**Cancreateattachment** | Pointer to **bool** | Whether the user has the capability mod/forum:createattachment allowed. | [optional] [default to null]
**Candeleteanypost** | Pointer to **bool** | Whether the user has the capability mod/forum:deleteanypost allowed. | [optional] [default to null]
**Candeleteownpost** | Pointer to **bool** | Whether the user has the capability mod/forum:deleteownpost allowed. | [optional] [default to null]
**Caneditanypost** | Pointer to **bool** | Whether the user has the capability mod/forum:editanypost allowed. | [optional] [default to null]
**Canexportdiscussion** | Pointer to **bool** | Whether the user has the capability mod/forum:exportdiscussion allowed. | [optional] [default to null]
**Canexportforum** | Pointer to **bool** | Whether the user has the capability mod/forum:exportforum allowed. | [optional] [default to null]
**Canexportownpost** | Pointer to **bool** | Whether the user has the capability mod/forum:exportownpost allowed. | [optional] [default to null]
**Canexportpost** | Pointer to **bool** | Whether the user has the capability mod/forum:exportpost allowed. | [optional] [default to null]
**Cangrade** | Pointer to **bool** | Whether the user has the capability mod/forum:grade allowed. | [optional] [default to null]
**Canmanagesubscriptions** | Pointer to **bool** | Whether the user has the capability mod/forum:managesubscriptions allowed. | [optional] [default to null]
**Canmovediscussions** | Pointer to **bool** | Whether the user has the capability mod/forum:movediscussions allowed. | [optional] [default to null]
**Canpindiscussions** | Pointer to **bool** | Whether the user has the capability mod/forum:pindiscussions allowed. | [optional] [default to null]
**Canpostprivatereply** | Pointer to **bool** | Whether the user has the capability mod/forum:postprivatereply allowed. | [optional] [default to null]
**Canpostwithoutthrottling** | Pointer to **bool** | Whether the user has the capability mod/forum:postwithoutthrottling allowed. | [optional] [default to null]
**Canrate** | Pointer to **bool** | Whether the user has the capability mod/forum:rate allowed. | [optional] [default to null]
**Canreadprivatereplies** | Pointer to **bool** | Whether the user has the capability mod/forum:readprivatereplies allowed. | [optional] [default to null]
**Canreplynews** | Pointer to **bool** | Whether the user has the capability mod/forum:replynews allowed. | [optional] [default to null]
**Canreplypost** | Pointer to **bool** | Whether the user has the capability mod/forum:replypost allowed. | [optional] [default to null]
**Cansplitdiscussions** | Pointer to **bool** | Whether the user has the capability mod/forum:splitdiscussions allowed. | [optional] [default to null]
**Canstartdiscussion** | Pointer to **bool** | Whether the user has the capability mod/forum:startdiscussion allowed. | [optional] [default to null]
**Canviewallratings** | Pointer to **bool** | Whether the user has the capability mod/forum:viewallratings allowed. | [optional] [default to null]
**Canviewanyrating** | Pointer to **bool** | Whether the user has the capability mod/forum:viewanyrating allowed. | [optional] [default to null]
**Canviewdiscussion** | Pointer to **bool** | Whether the user has the capability mod/forum:viewdiscussion allowed. | [optional] [default to null]
**Canviewhiddentimedposts** | Pointer to **bool** | Whether the user has the capability mod/forum:viewhiddentimedposts allowed. | [optional] [default to null]
**Canviewqandawithoutposting** | Pointer to **bool** | Whether the user has the capability mod/forum:viewqandawithoutposting allowed. | [optional] [default to null]
**Canviewrating** | Pointer to **bool** | Whether the user has the capability mod/forum:viewrating allowed. | [optional] [default to null]
**Canviewsubscribers** | Pointer to **bool** | Whether the user has the capability mod/forum:viewsubscribers allowed. | [optional] [default to null]
**Warnings** | Pointer to [**[]AuthEmailSignupUser200ResponseWarningsInner**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Methods

### NewModForumGetForumAccessInformation200Response

`func NewModForumGetForumAccessInformation200Response() *ModForumGetForumAccessInformation200Response`

NewModForumGetForumAccessInformation200Response instantiates a new ModForumGetForumAccessInformation200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModForumGetForumAccessInformation200ResponseWithDefaults

`func NewModForumGetForumAccessInformation200ResponseWithDefaults() *ModForumGetForumAccessInformation200Response`

NewModForumGetForumAccessInformation200ResponseWithDefaults instantiates a new ModForumGetForumAccessInformation200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCanaddinstance

`func (o *ModForumGetForumAccessInformation200Response) GetCanaddinstance() bool`

GetCanaddinstance returns the Canaddinstance field if non-nil, zero value otherwise.

### GetCanaddinstanceOk

`func (o *ModForumGetForumAccessInformation200Response) GetCanaddinstanceOk() (*bool, bool)`

GetCanaddinstanceOk returns a tuple with the Canaddinstance field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCanaddinstance

`func (o *ModForumGetForumAccessInformation200Response) SetCanaddinstance(v bool)`

SetCanaddinstance sets Canaddinstance field to given value.

### HasCanaddinstance

`func (o *ModForumGetForumAccessInformation200Response) HasCanaddinstance() bool`

HasCanaddinstance returns a boolean if a field has been set.

### GetCanaddnews

`func (o *ModForumGetForumAccessInformation200Response) GetCanaddnews() bool`

GetCanaddnews returns the Canaddnews field if non-nil, zero value otherwise.

### GetCanaddnewsOk

`func (o *ModForumGetForumAccessInformation200Response) GetCanaddnewsOk() (*bool, bool)`

GetCanaddnewsOk returns a tuple with the Canaddnews field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCanaddnews

`func (o *ModForumGetForumAccessInformation200Response) SetCanaddnews(v bool)`

SetCanaddnews sets Canaddnews field to given value.

### HasCanaddnews

`func (o *ModForumGetForumAccessInformation200Response) HasCanaddnews() bool`

HasCanaddnews returns a boolean if a field has been set.

### GetCanaddquestion

`func (o *ModForumGetForumAccessInformation200Response) GetCanaddquestion() bool`

GetCanaddquestion returns the Canaddquestion field if non-nil, zero value otherwise.

### GetCanaddquestionOk

`func (o *ModForumGetForumAccessInformation200Response) GetCanaddquestionOk() (*bool, bool)`

GetCanaddquestionOk returns a tuple with the Canaddquestion field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCanaddquestion

`func (o *ModForumGetForumAccessInformation200Response) SetCanaddquestion(v bool)`

SetCanaddquestion sets Canaddquestion field to given value.

### HasCanaddquestion

`func (o *ModForumGetForumAccessInformation200Response) HasCanaddquestion() bool`

HasCanaddquestion returns a boolean if a field has been set.

### GetCanallowforcesubscribe

`func (o *ModForumGetForumAccessInformation200Response) GetCanallowforcesubscribe() bool`

GetCanallowforcesubscribe returns the Canallowforcesubscribe field if non-nil, zero value otherwise.

### GetCanallowforcesubscribeOk

`func (o *ModForumGetForumAccessInformation200Response) GetCanallowforcesubscribeOk() (*bool, bool)`

GetCanallowforcesubscribeOk returns a tuple with the Canallowforcesubscribe field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCanallowforcesubscribe

`func (o *ModForumGetForumAccessInformation200Response) SetCanallowforcesubscribe(v bool)`

SetCanallowforcesubscribe sets Canallowforcesubscribe field to given value.

### HasCanallowforcesubscribe

`func (o *ModForumGetForumAccessInformation200Response) HasCanallowforcesubscribe() bool`

HasCanallowforcesubscribe returns a boolean if a field has been set.

### GetCancanmailnow

`func (o *ModForumGetForumAccessInformation200Response) GetCancanmailnow() bool`

GetCancanmailnow returns the Cancanmailnow field if non-nil, zero value otherwise.

### GetCancanmailnowOk

`func (o *ModForumGetForumAccessInformation200Response) GetCancanmailnowOk() (*bool, bool)`

GetCancanmailnowOk returns a tuple with the Cancanmailnow field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCancanmailnow

`func (o *ModForumGetForumAccessInformation200Response) SetCancanmailnow(v bool)`

SetCancanmailnow sets Cancanmailnow field to given value.

### HasCancanmailnow

`func (o *ModForumGetForumAccessInformation200Response) HasCancanmailnow() bool`

HasCancanmailnow returns a boolean if a field has been set.

### GetCancanoverridecutoff

`func (o *ModForumGetForumAccessInformation200Response) GetCancanoverridecutoff() bool`

GetCancanoverridecutoff returns the Cancanoverridecutoff field if non-nil, zero value otherwise.

### GetCancanoverridecutoffOk

`func (o *ModForumGetForumAccessInformation200Response) GetCancanoverridecutoffOk() (*bool, bool)`

GetCancanoverridecutoffOk returns a tuple with the Cancanoverridecutoff field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCancanoverridecutoff

`func (o *ModForumGetForumAccessInformation200Response) SetCancanoverridecutoff(v bool)`

SetCancanoverridecutoff sets Cancanoverridecutoff field to given value.

### HasCancanoverridecutoff

`func (o *ModForumGetForumAccessInformation200Response) HasCancanoverridecutoff() bool`

HasCancanoverridecutoff returns a boolean if a field has been set.

### GetCancanoverridediscussionlock

`func (o *ModForumGetForumAccessInformation200Response) GetCancanoverridediscussionlock() bool`

GetCancanoverridediscussionlock returns the Cancanoverridediscussionlock field if non-nil, zero value otherwise.

### GetCancanoverridediscussionlockOk

`func (o *ModForumGetForumAccessInformation200Response) GetCancanoverridediscussionlockOk() (*bool, bool)`

GetCancanoverridediscussionlockOk returns a tuple with the Cancanoverridediscussionlock field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCancanoverridediscussionlock

`func (o *ModForumGetForumAccessInformation200Response) SetCancanoverridediscussionlock(v bool)`

SetCancanoverridediscussionlock sets Cancanoverridediscussionlock field to given value.

### HasCancanoverridediscussionlock

`func (o *ModForumGetForumAccessInformation200Response) HasCancanoverridediscussionlock() bool`

HasCancanoverridediscussionlock returns a boolean if a field has been set.

### GetCancanposttomygroups

`func (o *ModForumGetForumAccessInformation200Response) GetCancanposttomygroups() bool`

GetCancanposttomygroups returns the Cancanposttomygroups field if non-nil, zero value otherwise.

### GetCancanposttomygroupsOk

`func (o *ModForumGetForumAccessInformation200Response) GetCancanposttomygroupsOk() (*bool, bool)`

GetCancanposttomygroupsOk returns a tuple with the Cancanposttomygroups field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCancanposttomygroups

`func (o *ModForumGetForumAccessInformation200Response) SetCancanposttomygroups(v bool)`

SetCancanposttomygroups sets Cancanposttomygroups field to given value.

### HasCancanposttomygroups

`func (o *ModForumGetForumAccessInformation200Response) HasCancanposttomygroups() bool`

HasCancanposttomygroups returns a boolean if a field has been set.

### GetCancantogglefavourite

`func (o *ModForumGetForumAccessInformation200Response) GetCancantogglefavourite() bool`

GetCancantogglefavourite returns the Cancantogglefavourite field if non-nil, zero value otherwise.

### GetCancantogglefavouriteOk

`func (o *ModForumGetForumAccessInformation200Response) GetCancantogglefavouriteOk() (*bool, bool)`

GetCancantogglefavouriteOk returns a tuple with the Cancantogglefavourite field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCancantogglefavourite

`func (o *ModForumGetForumAccessInformation200Response) SetCancantogglefavourite(v bool)`

SetCancantogglefavourite sets Cancantogglefavourite field to given value.

### HasCancantogglefavourite

`func (o *ModForumGetForumAccessInformation200Response) HasCancantogglefavourite() bool`

HasCancantogglefavourite returns a boolean if a field has been set.

### GetCancreateattachment

`func (o *ModForumGetForumAccessInformation200Response) GetCancreateattachment() bool`

GetCancreateattachment returns the Cancreateattachment field if non-nil, zero value otherwise.

### GetCancreateattachmentOk

`func (o *ModForumGetForumAccessInformation200Response) GetCancreateattachmentOk() (*bool, bool)`

GetCancreateattachmentOk returns a tuple with the Cancreateattachment field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCancreateattachment

`func (o *ModForumGetForumAccessInformation200Response) SetCancreateattachment(v bool)`

SetCancreateattachment sets Cancreateattachment field to given value.

### HasCancreateattachment

`func (o *ModForumGetForumAccessInformation200Response) HasCancreateattachment() bool`

HasCancreateattachment returns a boolean if a field has been set.

### GetCandeleteanypost

`func (o *ModForumGetForumAccessInformation200Response) GetCandeleteanypost() bool`

GetCandeleteanypost returns the Candeleteanypost field if non-nil, zero value otherwise.

### GetCandeleteanypostOk

`func (o *ModForumGetForumAccessInformation200Response) GetCandeleteanypostOk() (*bool, bool)`

GetCandeleteanypostOk returns a tuple with the Candeleteanypost field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCandeleteanypost

`func (o *ModForumGetForumAccessInformation200Response) SetCandeleteanypost(v bool)`

SetCandeleteanypost sets Candeleteanypost field to given value.

### HasCandeleteanypost

`func (o *ModForumGetForumAccessInformation200Response) HasCandeleteanypost() bool`

HasCandeleteanypost returns a boolean if a field has been set.

### GetCandeleteownpost

`func (o *ModForumGetForumAccessInformation200Response) GetCandeleteownpost() bool`

GetCandeleteownpost returns the Candeleteownpost field if non-nil, zero value otherwise.

### GetCandeleteownpostOk

`func (o *ModForumGetForumAccessInformation200Response) GetCandeleteownpostOk() (*bool, bool)`

GetCandeleteownpostOk returns a tuple with the Candeleteownpost field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCandeleteownpost

`func (o *ModForumGetForumAccessInformation200Response) SetCandeleteownpost(v bool)`

SetCandeleteownpost sets Candeleteownpost field to given value.

### HasCandeleteownpost

`func (o *ModForumGetForumAccessInformation200Response) HasCandeleteownpost() bool`

HasCandeleteownpost returns a boolean if a field has been set.

### GetCaneditanypost

`func (o *ModForumGetForumAccessInformation200Response) GetCaneditanypost() bool`

GetCaneditanypost returns the Caneditanypost field if non-nil, zero value otherwise.

### GetCaneditanypostOk

`func (o *ModForumGetForumAccessInformation200Response) GetCaneditanypostOk() (*bool, bool)`

GetCaneditanypostOk returns a tuple with the Caneditanypost field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCaneditanypost

`func (o *ModForumGetForumAccessInformation200Response) SetCaneditanypost(v bool)`

SetCaneditanypost sets Caneditanypost field to given value.

### HasCaneditanypost

`func (o *ModForumGetForumAccessInformation200Response) HasCaneditanypost() bool`

HasCaneditanypost returns a boolean if a field has been set.

### GetCanexportdiscussion

`func (o *ModForumGetForumAccessInformation200Response) GetCanexportdiscussion() bool`

GetCanexportdiscussion returns the Canexportdiscussion field if non-nil, zero value otherwise.

### GetCanexportdiscussionOk

`func (o *ModForumGetForumAccessInformation200Response) GetCanexportdiscussionOk() (*bool, bool)`

GetCanexportdiscussionOk returns a tuple with the Canexportdiscussion field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCanexportdiscussion

`func (o *ModForumGetForumAccessInformation200Response) SetCanexportdiscussion(v bool)`

SetCanexportdiscussion sets Canexportdiscussion field to given value.

### HasCanexportdiscussion

`func (o *ModForumGetForumAccessInformation200Response) HasCanexportdiscussion() bool`

HasCanexportdiscussion returns a boolean if a field has been set.

### GetCanexportforum

`func (o *ModForumGetForumAccessInformation200Response) GetCanexportforum() bool`

GetCanexportforum returns the Canexportforum field if non-nil, zero value otherwise.

### GetCanexportforumOk

`func (o *ModForumGetForumAccessInformation200Response) GetCanexportforumOk() (*bool, bool)`

GetCanexportforumOk returns a tuple with the Canexportforum field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCanexportforum

`func (o *ModForumGetForumAccessInformation200Response) SetCanexportforum(v bool)`

SetCanexportforum sets Canexportforum field to given value.

### HasCanexportforum

`func (o *ModForumGetForumAccessInformation200Response) HasCanexportforum() bool`

HasCanexportforum returns a boolean if a field has been set.

### GetCanexportownpost

`func (o *ModForumGetForumAccessInformation200Response) GetCanexportownpost() bool`

GetCanexportownpost returns the Canexportownpost field if non-nil, zero value otherwise.

### GetCanexportownpostOk

`func (o *ModForumGetForumAccessInformation200Response) GetCanexportownpostOk() (*bool, bool)`

GetCanexportownpostOk returns a tuple with the Canexportownpost field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCanexportownpost

`func (o *ModForumGetForumAccessInformation200Response) SetCanexportownpost(v bool)`

SetCanexportownpost sets Canexportownpost field to given value.

### HasCanexportownpost

`func (o *ModForumGetForumAccessInformation200Response) HasCanexportownpost() bool`

HasCanexportownpost returns a boolean if a field has been set.

### GetCanexportpost

`func (o *ModForumGetForumAccessInformation200Response) GetCanexportpost() bool`

GetCanexportpost returns the Canexportpost field if non-nil, zero value otherwise.

### GetCanexportpostOk

`func (o *ModForumGetForumAccessInformation200Response) GetCanexportpostOk() (*bool, bool)`

GetCanexportpostOk returns a tuple with the Canexportpost field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCanexportpost

`func (o *ModForumGetForumAccessInformation200Response) SetCanexportpost(v bool)`

SetCanexportpost sets Canexportpost field to given value.

### HasCanexportpost

`func (o *ModForumGetForumAccessInformation200Response) HasCanexportpost() bool`

HasCanexportpost returns a boolean if a field has been set.

### GetCangrade

`func (o *ModForumGetForumAccessInformation200Response) GetCangrade() bool`

GetCangrade returns the Cangrade field if non-nil, zero value otherwise.

### GetCangradeOk

`func (o *ModForumGetForumAccessInformation200Response) GetCangradeOk() (*bool, bool)`

GetCangradeOk returns a tuple with the Cangrade field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCangrade

`func (o *ModForumGetForumAccessInformation200Response) SetCangrade(v bool)`

SetCangrade sets Cangrade field to given value.

### HasCangrade

`func (o *ModForumGetForumAccessInformation200Response) HasCangrade() bool`

HasCangrade returns a boolean if a field has been set.

### GetCanmanagesubscriptions

`func (o *ModForumGetForumAccessInformation200Response) GetCanmanagesubscriptions() bool`

GetCanmanagesubscriptions returns the Canmanagesubscriptions field if non-nil, zero value otherwise.

### GetCanmanagesubscriptionsOk

`func (o *ModForumGetForumAccessInformation200Response) GetCanmanagesubscriptionsOk() (*bool, bool)`

GetCanmanagesubscriptionsOk returns a tuple with the Canmanagesubscriptions field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCanmanagesubscriptions

`func (o *ModForumGetForumAccessInformation200Response) SetCanmanagesubscriptions(v bool)`

SetCanmanagesubscriptions sets Canmanagesubscriptions field to given value.

### HasCanmanagesubscriptions

`func (o *ModForumGetForumAccessInformation200Response) HasCanmanagesubscriptions() bool`

HasCanmanagesubscriptions returns a boolean if a field has been set.

### GetCanmovediscussions

`func (o *ModForumGetForumAccessInformation200Response) GetCanmovediscussions() bool`

GetCanmovediscussions returns the Canmovediscussions field if non-nil, zero value otherwise.

### GetCanmovediscussionsOk

`func (o *ModForumGetForumAccessInformation200Response) GetCanmovediscussionsOk() (*bool, bool)`

GetCanmovediscussionsOk returns a tuple with the Canmovediscussions field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCanmovediscussions

`func (o *ModForumGetForumAccessInformation200Response) SetCanmovediscussions(v bool)`

SetCanmovediscussions sets Canmovediscussions field to given value.

### HasCanmovediscussions

`func (o *ModForumGetForumAccessInformation200Response) HasCanmovediscussions() bool`

HasCanmovediscussions returns a boolean if a field has been set.

### GetCanpindiscussions

`func (o *ModForumGetForumAccessInformation200Response) GetCanpindiscussions() bool`

GetCanpindiscussions returns the Canpindiscussions field if non-nil, zero value otherwise.

### GetCanpindiscussionsOk

`func (o *ModForumGetForumAccessInformation200Response) GetCanpindiscussionsOk() (*bool, bool)`

GetCanpindiscussionsOk returns a tuple with the Canpindiscussions field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCanpindiscussions

`func (o *ModForumGetForumAccessInformation200Response) SetCanpindiscussions(v bool)`

SetCanpindiscussions sets Canpindiscussions field to given value.

### HasCanpindiscussions

`func (o *ModForumGetForumAccessInformation200Response) HasCanpindiscussions() bool`

HasCanpindiscussions returns a boolean if a field has been set.

### GetCanpostprivatereply

`func (o *ModForumGetForumAccessInformation200Response) GetCanpostprivatereply() bool`

GetCanpostprivatereply returns the Canpostprivatereply field if non-nil, zero value otherwise.

### GetCanpostprivatereplyOk

`func (o *ModForumGetForumAccessInformation200Response) GetCanpostprivatereplyOk() (*bool, bool)`

GetCanpostprivatereplyOk returns a tuple with the Canpostprivatereply field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCanpostprivatereply

`func (o *ModForumGetForumAccessInformation200Response) SetCanpostprivatereply(v bool)`

SetCanpostprivatereply sets Canpostprivatereply field to given value.

### HasCanpostprivatereply

`func (o *ModForumGetForumAccessInformation200Response) HasCanpostprivatereply() bool`

HasCanpostprivatereply returns a boolean if a field has been set.

### GetCanpostwithoutthrottling

`func (o *ModForumGetForumAccessInformation200Response) GetCanpostwithoutthrottling() bool`

GetCanpostwithoutthrottling returns the Canpostwithoutthrottling field if non-nil, zero value otherwise.

### GetCanpostwithoutthrottlingOk

`func (o *ModForumGetForumAccessInformation200Response) GetCanpostwithoutthrottlingOk() (*bool, bool)`

GetCanpostwithoutthrottlingOk returns a tuple with the Canpostwithoutthrottling field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCanpostwithoutthrottling

`func (o *ModForumGetForumAccessInformation200Response) SetCanpostwithoutthrottling(v bool)`

SetCanpostwithoutthrottling sets Canpostwithoutthrottling field to given value.

### HasCanpostwithoutthrottling

`func (o *ModForumGetForumAccessInformation200Response) HasCanpostwithoutthrottling() bool`

HasCanpostwithoutthrottling returns a boolean if a field has been set.

### GetCanrate

`func (o *ModForumGetForumAccessInformation200Response) GetCanrate() bool`

GetCanrate returns the Canrate field if non-nil, zero value otherwise.

### GetCanrateOk

`func (o *ModForumGetForumAccessInformation200Response) GetCanrateOk() (*bool, bool)`

GetCanrateOk returns a tuple with the Canrate field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCanrate

`func (o *ModForumGetForumAccessInformation200Response) SetCanrate(v bool)`

SetCanrate sets Canrate field to given value.

### HasCanrate

`func (o *ModForumGetForumAccessInformation200Response) HasCanrate() bool`

HasCanrate returns a boolean if a field has been set.

### GetCanreadprivatereplies

`func (o *ModForumGetForumAccessInformation200Response) GetCanreadprivatereplies() bool`

GetCanreadprivatereplies returns the Canreadprivatereplies field if non-nil, zero value otherwise.

### GetCanreadprivaterepliesOk

`func (o *ModForumGetForumAccessInformation200Response) GetCanreadprivaterepliesOk() (*bool, bool)`

GetCanreadprivaterepliesOk returns a tuple with the Canreadprivatereplies field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCanreadprivatereplies

`func (o *ModForumGetForumAccessInformation200Response) SetCanreadprivatereplies(v bool)`

SetCanreadprivatereplies sets Canreadprivatereplies field to given value.

### HasCanreadprivatereplies

`func (o *ModForumGetForumAccessInformation200Response) HasCanreadprivatereplies() bool`

HasCanreadprivatereplies returns a boolean if a field has been set.

### GetCanreplynews

`func (o *ModForumGetForumAccessInformation200Response) GetCanreplynews() bool`

GetCanreplynews returns the Canreplynews field if non-nil, zero value otherwise.

### GetCanreplynewsOk

`func (o *ModForumGetForumAccessInformation200Response) GetCanreplynewsOk() (*bool, bool)`

GetCanreplynewsOk returns a tuple with the Canreplynews field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCanreplynews

`func (o *ModForumGetForumAccessInformation200Response) SetCanreplynews(v bool)`

SetCanreplynews sets Canreplynews field to given value.

### HasCanreplynews

`func (o *ModForumGetForumAccessInformation200Response) HasCanreplynews() bool`

HasCanreplynews returns a boolean if a field has been set.

### GetCanreplypost

`func (o *ModForumGetForumAccessInformation200Response) GetCanreplypost() bool`

GetCanreplypost returns the Canreplypost field if non-nil, zero value otherwise.

### GetCanreplypostOk

`func (o *ModForumGetForumAccessInformation200Response) GetCanreplypostOk() (*bool, bool)`

GetCanreplypostOk returns a tuple with the Canreplypost field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCanreplypost

`func (o *ModForumGetForumAccessInformation200Response) SetCanreplypost(v bool)`

SetCanreplypost sets Canreplypost field to given value.

### HasCanreplypost

`func (o *ModForumGetForumAccessInformation200Response) HasCanreplypost() bool`

HasCanreplypost returns a boolean if a field has been set.

### GetCansplitdiscussions

`func (o *ModForumGetForumAccessInformation200Response) GetCansplitdiscussions() bool`

GetCansplitdiscussions returns the Cansplitdiscussions field if non-nil, zero value otherwise.

### GetCansplitdiscussionsOk

`func (o *ModForumGetForumAccessInformation200Response) GetCansplitdiscussionsOk() (*bool, bool)`

GetCansplitdiscussionsOk returns a tuple with the Cansplitdiscussions field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCansplitdiscussions

`func (o *ModForumGetForumAccessInformation200Response) SetCansplitdiscussions(v bool)`

SetCansplitdiscussions sets Cansplitdiscussions field to given value.

### HasCansplitdiscussions

`func (o *ModForumGetForumAccessInformation200Response) HasCansplitdiscussions() bool`

HasCansplitdiscussions returns a boolean if a field has been set.

### GetCanstartdiscussion

`func (o *ModForumGetForumAccessInformation200Response) GetCanstartdiscussion() bool`

GetCanstartdiscussion returns the Canstartdiscussion field if non-nil, zero value otherwise.

### GetCanstartdiscussionOk

`func (o *ModForumGetForumAccessInformation200Response) GetCanstartdiscussionOk() (*bool, bool)`

GetCanstartdiscussionOk returns a tuple with the Canstartdiscussion field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCanstartdiscussion

`func (o *ModForumGetForumAccessInformation200Response) SetCanstartdiscussion(v bool)`

SetCanstartdiscussion sets Canstartdiscussion field to given value.

### HasCanstartdiscussion

`func (o *ModForumGetForumAccessInformation200Response) HasCanstartdiscussion() bool`

HasCanstartdiscussion returns a boolean if a field has been set.

### GetCanviewallratings

`func (o *ModForumGetForumAccessInformation200Response) GetCanviewallratings() bool`

GetCanviewallratings returns the Canviewallratings field if non-nil, zero value otherwise.

### GetCanviewallratingsOk

`func (o *ModForumGetForumAccessInformation200Response) GetCanviewallratingsOk() (*bool, bool)`

GetCanviewallratingsOk returns a tuple with the Canviewallratings field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCanviewallratings

`func (o *ModForumGetForumAccessInformation200Response) SetCanviewallratings(v bool)`

SetCanviewallratings sets Canviewallratings field to given value.

### HasCanviewallratings

`func (o *ModForumGetForumAccessInformation200Response) HasCanviewallratings() bool`

HasCanviewallratings returns a boolean if a field has been set.

### GetCanviewanyrating

`func (o *ModForumGetForumAccessInformation200Response) GetCanviewanyrating() bool`

GetCanviewanyrating returns the Canviewanyrating field if non-nil, zero value otherwise.

### GetCanviewanyratingOk

`func (o *ModForumGetForumAccessInformation200Response) GetCanviewanyratingOk() (*bool, bool)`

GetCanviewanyratingOk returns a tuple with the Canviewanyrating field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCanviewanyrating

`func (o *ModForumGetForumAccessInformation200Response) SetCanviewanyrating(v bool)`

SetCanviewanyrating sets Canviewanyrating field to given value.

### HasCanviewanyrating

`func (o *ModForumGetForumAccessInformation200Response) HasCanviewanyrating() bool`

HasCanviewanyrating returns a boolean if a field has been set.

### GetCanviewdiscussion

`func (o *ModForumGetForumAccessInformation200Response) GetCanviewdiscussion() bool`

GetCanviewdiscussion returns the Canviewdiscussion field if non-nil, zero value otherwise.

### GetCanviewdiscussionOk

`func (o *ModForumGetForumAccessInformation200Response) GetCanviewdiscussionOk() (*bool, bool)`

GetCanviewdiscussionOk returns a tuple with the Canviewdiscussion field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCanviewdiscussion

`func (o *ModForumGetForumAccessInformation200Response) SetCanviewdiscussion(v bool)`

SetCanviewdiscussion sets Canviewdiscussion field to given value.

### HasCanviewdiscussion

`func (o *ModForumGetForumAccessInformation200Response) HasCanviewdiscussion() bool`

HasCanviewdiscussion returns a boolean if a field has been set.

### GetCanviewhiddentimedposts

`func (o *ModForumGetForumAccessInformation200Response) GetCanviewhiddentimedposts() bool`

GetCanviewhiddentimedposts returns the Canviewhiddentimedposts field if non-nil, zero value otherwise.

### GetCanviewhiddentimedpostsOk

`func (o *ModForumGetForumAccessInformation200Response) GetCanviewhiddentimedpostsOk() (*bool, bool)`

GetCanviewhiddentimedpostsOk returns a tuple with the Canviewhiddentimedposts field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCanviewhiddentimedposts

`func (o *ModForumGetForumAccessInformation200Response) SetCanviewhiddentimedposts(v bool)`

SetCanviewhiddentimedposts sets Canviewhiddentimedposts field to given value.

### HasCanviewhiddentimedposts

`func (o *ModForumGetForumAccessInformation200Response) HasCanviewhiddentimedposts() bool`

HasCanviewhiddentimedposts returns a boolean if a field has been set.

### GetCanviewqandawithoutposting

`func (o *ModForumGetForumAccessInformation200Response) GetCanviewqandawithoutposting() bool`

GetCanviewqandawithoutposting returns the Canviewqandawithoutposting field if non-nil, zero value otherwise.

### GetCanviewqandawithoutpostingOk

`func (o *ModForumGetForumAccessInformation200Response) GetCanviewqandawithoutpostingOk() (*bool, bool)`

GetCanviewqandawithoutpostingOk returns a tuple with the Canviewqandawithoutposting field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCanviewqandawithoutposting

`func (o *ModForumGetForumAccessInformation200Response) SetCanviewqandawithoutposting(v bool)`

SetCanviewqandawithoutposting sets Canviewqandawithoutposting field to given value.

### HasCanviewqandawithoutposting

`func (o *ModForumGetForumAccessInformation200Response) HasCanviewqandawithoutposting() bool`

HasCanviewqandawithoutposting returns a boolean if a field has been set.

### GetCanviewrating

`func (o *ModForumGetForumAccessInformation200Response) GetCanviewrating() bool`

GetCanviewrating returns the Canviewrating field if non-nil, zero value otherwise.

### GetCanviewratingOk

`func (o *ModForumGetForumAccessInformation200Response) GetCanviewratingOk() (*bool, bool)`

GetCanviewratingOk returns a tuple with the Canviewrating field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCanviewrating

`func (o *ModForumGetForumAccessInformation200Response) SetCanviewrating(v bool)`

SetCanviewrating sets Canviewrating field to given value.

### HasCanviewrating

`func (o *ModForumGetForumAccessInformation200Response) HasCanviewrating() bool`

HasCanviewrating returns a boolean if a field has been set.

### GetCanviewsubscribers

`func (o *ModForumGetForumAccessInformation200Response) GetCanviewsubscribers() bool`

GetCanviewsubscribers returns the Canviewsubscribers field if non-nil, zero value otherwise.

### GetCanviewsubscribersOk

`func (o *ModForumGetForumAccessInformation200Response) GetCanviewsubscribersOk() (*bool, bool)`

GetCanviewsubscribersOk returns a tuple with the Canviewsubscribers field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCanviewsubscribers

`func (o *ModForumGetForumAccessInformation200Response) SetCanviewsubscribers(v bool)`

SetCanviewsubscribers sets Canviewsubscribers field to given value.

### HasCanviewsubscribers

`func (o *ModForumGetForumAccessInformation200Response) HasCanviewsubscribers() bool`

HasCanviewsubscribers returns a boolean if a field has been set.

### GetWarnings

`func (o *ModForumGetForumAccessInformation200Response) GetWarnings() []AuthEmailSignupUser200ResponseWarningsInner`

GetWarnings returns the Warnings field if non-nil, zero value otherwise.

### GetWarningsOk

`func (o *ModForumGetForumAccessInformation200Response) GetWarningsOk() (*[]AuthEmailSignupUser200ResponseWarningsInner, bool)`

GetWarningsOk returns a tuple with the Warnings field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWarnings

`func (o *ModForumGetForumAccessInformation200Response) SetWarnings(v []AuthEmailSignupUser200ResponseWarningsInner)`

SetWarnings sets Warnings field to given value.

### HasWarnings

`func (o *ModForumGetForumAccessInformation200Response) HasWarnings() bool`

HasWarnings returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


