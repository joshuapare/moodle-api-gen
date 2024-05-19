/*
 * Moodle Webservice API
 *
 * Auto-generated OpenAPI spec for Moodle's Webservice API. Requires installation of the Catalyst RESTful API plugin: https://github.com/catalyst/moodle-webservice_restful.
 *
 * The version of the OpenAPI document: 4.3.4
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */


using System;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.IO;
using System.Runtime.Serialization;
using System.Text;
using System.Text.RegularExpressions;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using Newtonsoft.Json.Linq;
using System.ComponentModel.DataAnnotations;
using OpenAPIDateConverter = MoodleClient.Client.OpenAPIDateConverter;

namespace MoodleClient.Model
{
    /// <summary>
    /// CoreCourseAddContentItemToUserFavouritesRequest
    /// </summary>
    [DataContract(Name = "core_course_add_content_item_to_user_favourites_request")]
    public partial class CoreCourseAddContentItemToUserFavouritesRequest : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CoreCourseAddContentItemToUserFavouritesRequest" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected CoreCourseAddContentItemToUserFavouritesRequest() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="CoreCourseAddContentItemToUserFavouritesRequest" /> class.
        /// </summary>
        /// <param name="componentname">frankenstyle name of the component to which the content item belongs (required) (default to &quot;null&quot;).</param>
        /// <param name="contentitemid">id of the content item (required).</param>
        public CoreCourseAddContentItemToUserFavouritesRequest(string componentname = @"null", int contentitemid = default(int))
        {
            // to ensure "componentname" is required (not null)
            if (componentname == null)
            {
                throw new ArgumentNullException("componentname is a required property for CoreCourseAddContentItemToUserFavouritesRequest and cannot be null");
            }
            this.Componentname = componentname;
            this.Contentitemid = contentitemid;
        }

        /// <summary>
        /// frankenstyle name of the component to which the content item belongs
        /// </summary>
        /// <value>frankenstyle name of the component to which the content item belongs</value>
        [DataMember(Name = "componentname", IsRequired = true, EmitDefaultValue = true)]
        public string Componentname { get; set; }

        /// <summary>
        /// id of the content item
        /// </summary>
        /// <value>id of the content item</value>
        [DataMember(Name = "contentitemid", IsRequired = true, EmitDefaultValue = true)]
        public int Contentitemid { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class CoreCourseAddContentItemToUserFavouritesRequest {\n");
            sb.Append("  Componentname: ").Append(Componentname).Append("\n");
            sb.Append("  Contentitemid: ").Append(Contentitemid).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }

        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public virtual string ToJson()
        {
            return Newtonsoft.Json.JsonConvert.SerializeObject(this, Newtonsoft.Json.Formatting.Indented);
        }

        /// <summary>
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        IEnumerable<System.ComponentModel.DataAnnotations.ValidationResult> IValidatableObject.Validate(ValidationContext validationContext)
        {
            yield break;
        }
    }

}
