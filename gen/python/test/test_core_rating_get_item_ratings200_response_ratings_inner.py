# coding: utf-8

"""
    Moodle Webservice API

    Auto-generated OpenAPI spec for Moodle's Webservice API. Requires installation of the Catalyst RESTful API plugin: https://github.com/catalyst/moodle-webservice_restful.

    The version of the OpenAPI document: 4.3.4
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.core_rating_get_item_ratings200_response_ratings_inner import CoreRatingGetItemRatings200ResponseRatingsInner

class TestCoreRatingGetItemRatings200ResponseRatingsInner(unittest.TestCase):
    """CoreRatingGetItemRatings200ResponseRatingsInner unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> CoreRatingGetItemRatings200ResponseRatingsInner:
        """Test CoreRatingGetItemRatings200ResponseRatingsInner
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `CoreRatingGetItemRatings200ResponseRatingsInner`
        """
        model = CoreRatingGetItemRatings200ResponseRatingsInner()
        if include_optional:
            return CoreRatingGetItemRatings200ResponseRatingsInner(
                id = 56,
                rating = 'null',
                timemodified = 56,
                userfullname = 'null',
                userid = 56,
                userpictureurl = 'null'
            )
        else:
            return CoreRatingGetItemRatings200ResponseRatingsInner(
        )
        """

    def testCoreRatingGetItemRatings200ResponseRatingsInner(self):
        """Test CoreRatingGetItemRatings200ResponseRatingsInner"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
