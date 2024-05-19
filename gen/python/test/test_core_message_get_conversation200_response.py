# coding: utf-8

"""
    Moodle Webservice API

    Auto-generated OpenAPI spec for Moodle's Webservice API. Requires installation of the Catalyst RESTful API plugin: https://github.com/catalyst/moodle-webservice_restful.

    The version of the OpenAPI document: 4.3.4
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.core_message_get_conversation200_response import CoreMessageGetConversation200Response

class TestCoreMessageGetConversation200Response(unittest.TestCase):
    """CoreMessageGetConversation200Response unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> CoreMessageGetConversation200Response:
        """Test CoreMessageGetConversation200Response
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `CoreMessageGetConversation200Response`
        """
        model = CoreMessageGetConversation200Response()
        if include_optional:
            return CoreMessageGetConversation200Response(
                candeletemessagesforallusers = True,
                id = 56,
                imageurl = 'null',
                isfavourite = True,
                ismuted = True,
                isread = True,
                membercount = 56,
                members = [
                    openapi_client.models.core_message_get_conversation_200_response_members_inner.core_message_get_conversation_200_response_members_inner(
                        canmessage = True, 
                        canmessageevenifblocked = True, 
                        contactrequests = [
                            openapi_client.models.core_message_get_conversation_200_response_members_inner_contactrequests_inner.core_message_get_conversation_200_response_members_inner_contactrequests_inner(
                                id = 56, 
                                requesteduserid = 56, 
                                timecreated = 56, 
                                userid = 56, )
                            ], 
                        conversations = [
                            openapi_client.models.core_message_get_conversation_200_response_members_inner_conversations_inner.core_message_get_conversation_200_response_members_inner_conversations_inner(
                                id = 56, 
                                name = 'null', 
                                timecreated = 56, 
                                type = 56, )
                            ], 
                        fullname = '', 
                        id = 56, 
                        isblocked = True, 
                        iscontact = True, 
                        isdeleted = True, 
                        isonline = True, 
                        profileimageurl = '', 
                        profileimageurlsmall = '', 
                        profileurl = 'null', 
                        requirescontact = True, 
                        showonlinestatus = True, )
                    ],
                messages = [
                    openapi_client.models.core_message_get_conversation_200_response_messages_inner.core_message_get_conversation_200_response_messages_inner(
                        id = 56, 
                        text = 'null', 
                        timecreated = 56, 
                        useridfrom = 56, )
                    ],
                name = 'null',
                subname = 'null',
                type = 56,
                unreadcount = 56
            )
        else:
            return CoreMessageGetConversation200Response(
                id = 56,
                isfavourite = True,
                ismuted = True,
                isread = True,
                membercount = 56,
                members = [
                    openapi_client.models.core_message_get_conversation_200_response_members_inner.core_message_get_conversation_200_response_members_inner(
                        canmessage = True, 
                        canmessageevenifblocked = True, 
                        contactrequests = [
                            openapi_client.models.core_message_get_conversation_200_response_members_inner_contactrequests_inner.core_message_get_conversation_200_response_members_inner_contactrequests_inner(
                                id = 56, 
                                requesteduserid = 56, 
                                timecreated = 56, 
                                userid = 56, )
                            ], 
                        conversations = [
                            openapi_client.models.core_message_get_conversation_200_response_members_inner_conversations_inner.core_message_get_conversation_200_response_members_inner_conversations_inner(
                                id = 56, 
                                name = 'null', 
                                timecreated = 56, 
                                type = 56, )
                            ], 
                        fullname = '', 
                        id = 56, 
                        isblocked = True, 
                        iscontact = True, 
                        isdeleted = True, 
                        isonline = True, 
                        profileimageurl = '', 
                        profileimageurlsmall = '', 
                        profileurl = 'null', 
                        requirescontact = True, 
                        showonlinestatus = True, )
                    ],
                messages = [
                    openapi_client.models.core_message_get_conversation_200_response_messages_inner.core_message_get_conversation_200_response_messages_inner(
                        id = 56, 
                        text = 'null', 
                        timecreated = 56, 
                        useridfrom = 56, )
                    ],
                type = 56,
        )
        """

    def testCoreMessageGetConversation200Response(self):
        """Test CoreMessageGetConversation200Response"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
