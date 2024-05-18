# coding: utf-8

"""
    Moodle Webservice API

    Auto-generated OpenAPI spec for Moodle's Webservice API. Requires installation of the Catalyst RESTful API plugin: https://github.com/catalyst/moodle-webservice_restful.

    The version of the OpenAPI document: 4.3.4
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.core_message_data_for_messagearea_search_messages200_response import CoreMessageDataForMessageareaSearchMessages200Response

class TestCoreMessageDataForMessageareaSearchMessages200Response(unittest.TestCase):
    """CoreMessageDataForMessageareaSearchMessages200Response unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> CoreMessageDataForMessageareaSearchMessages200Response:
        """Test CoreMessageDataForMessageareaSearchMessages200Response
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `CoreMessageDataForMessageareaSearchMessages200Response`
        """
        model = CoreMessageDataForMessageareaSearchMessages200Response()
        if include_optional:
            return CoreMessageDataForMessageareaSearchMessages200Response(
                contacts = [
                    openapi_client.models.core_message_data_for_messagearea_search_messages_200_response_contacts_inner.core_message_data_for_messagearea_search_messages_200_response_contacts_inner(
                        conversationid = 56, 
                        fullname = 'null', 
                        isblocked = True, 
                        ismessaging = True, 
                        isonline = True, 
                        isread = True, 
                        lastmessage = 'null', 
                        lastmessagedate = 56, 
                        messageid = 56, 
                        profileimageurl = 'null', 
                        profileimageurlsmall = 'null', 
                        sentfromcurrentuser = True, 
                        showonlinestatus = True, 
                        unreadcount = 56, 
                        userid = 56, )
                    ]
            )
        else:
            return CoreMessageDataForMessageareaSearchMessages200Response(
                contacts = [
                    openapi_client.models.core_message_data_for_messagearea_search_messages_200_response_contacts_inner.core_message_data_for_messagearea_search_messages_200_response_contacts_inner(
                        conversationid = 56, 
                        fullname = 'null', 
                        isblocked = True, 
                        ismessaging = True, 
                        isonline = True, 
                        isread = True, 
                        lastmessage = 'null', 
                        lastmessagedate = 56, 
                        messageid = 56, 
                        profileimageurl = 'null', 
                        profileimageurlsmall = 'null', 
                        sentfromcurrentuser = True, 
                        showonlinestatus = True, 
                        unreadcount = 56, 
                        userid = 56, )
                    ],
        )
        """

    def testCoreMessageDataForMessageareaSearchMessages200Response(self):
        """Test CoreMessageDataForMessageareaSearchMessages200Response"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()