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
    /// ModForumGetDiscussionPostRequest
    /// </summary>
    [DataContract(Name = "mod_forum_get_discussion_post_request")]
    public partial class ModForumGetDiscussionPostRequest : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ModForumGetDiscussionPostRequest" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected ModForumGetDiscussionPostRequest() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="ModForumGetDiscussionPostRequest" /> class.
        /// </summary>
        /// <param name="postid">Post to fetch. (required) (default to null).</param>
        public ModForumGetDiscussionPostRequest(int postid = null)
        {
            this.Postid = postid;
        }

        /// <summary>
        /// Post to fetch.
        /// </summary>
        /// <value>Post to fetch.</value>
        [DataMember(Name = "postid", IsRequired = true, EmitDefaultValue = true)]
        public int Postid { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class ModForumGetDiscussionPostRequest {\n");
            sb.Append("  Postid: ").Append(Postid).Append("\n");
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
