# coding: utf-8

"""
    Moodle Webservice API

    Auto-generated OpenAPI spec for Moodle's Webservice API. Requires installation of the Catalyst RESTful API plugin: https://github.com/catalyst/moodle-webservice_restful.

    The version of the OpenAPI document: 4.3.4
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.core_message_get_conversation200_response_messages_inner import CoreMessageGetConversation200ResponseMessagesInner

class TestCoreMessageGetConversation200ResponseMessagesInner(unittest.TestCase):
    """CoreMessageGetConversation200ResponseMessagesInner unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> CoreMessageGetConversation200ResponseMessagesInner:
        """Test CoreMessageGetConversation200ResponseMessagesInner
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `CoreMessageGetConversation200ResponseMessagesInner`
        """
        model = CoreMessageGetConversation200ResponseMessagesInner()
        if include_optional:
            return CoreMessageGetConversation200ResponseMessagesInner(
                id = 56,
                text = 'null',
                timecreated = 56,
                useridfrom = 56
            )
        else:
            return CoreMessageGetConversation200ResponseMessagesInner(
        )
        """

    def testCoreMessageGetConversation200ResponseMessagesInner(self):
        """Test CoreMessageGetConversation200ResponseMessagesInner"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
