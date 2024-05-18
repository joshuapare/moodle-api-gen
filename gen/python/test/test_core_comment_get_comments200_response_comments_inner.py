# coding: utf-8

"""
    Moodle Webservice API

    Auto-generated OpenAPI spec for Moodle's Webservice API. Requires installation of the Catalyst RESTful API plugin: https://github.com/catalyst/moodle-webservice_restful.

    The version of the OpenAPI document: 4.3.4
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.core_comment_get_comments200_response_comments_inner import CoreCommentGetComments200ResponseCommentsInner

class TestCoreCommentGetComments200ResponseCommentsInner(unittest.TestCase):
    """CoreCommentGetComments200ResponseCommentsInner unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> CoreCommentGetComments200ResponseCommentsInner:
        """Test CoreCommentGetComments200ResponseCommentsInner
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `CoreCommentGetComments200ResponseCommentsInner`
        """
        model = CoreCommentGetComments200ResponseCommentsInner()
        if include_optional:
            return CoreCommentGetComments200ResponseCommentsInner(
                avatar = 'null',
                content = 'null',
                delete = True,
                format = 56,
                fullname = 'null',
                id = 56,
                profileurl = 'null',
                strftimeformat = 'null',
                time = 'null',
                timecreated = 56,
                userid = 56
            )
        else:
            return CoreCommentGetComments200ResponseCommentsInner(
        )
        """

    def testCoreCommentGetComments200ResponseCommentsInner(self):
        """Test CoreCommentGetComments200ResponseCommentsInner"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
