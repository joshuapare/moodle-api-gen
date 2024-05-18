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
using OpenAPIDateConverter = Org.OpenAPITools.Client.OpenAPIDateConverter;

namespace Org.OpenAPITools.Model
{
    /// <summary>
    /// CoreCommentDeleteCommentsRequest
    /// </summary>
    [DataContract(Name = "core_comment_delete_comments_request")]
    public partial class CoreCommentDeleteCommentsRequest : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CoreCommentDeleteCommentsRequest" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected CoreCommentDeleteCommentsRequest() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="CoreCommentDeleteCommentsRequest" /> class.
        /// </summary>
        /// <param name="comments">comments (required).</param>
        public CoreCommentDeleteCommentsRequest(List<Object> comments = default(List<Object>))
        {
            // to ensure "comments" is required (not null)
            if (comments == null)
            {
                throw new ArgumentNullException("comments is a required property for CoreCommentDeleteCommentsRequest and cannot be null");
            }
            this.Comments = comments;
        }

        /// <summary>
        /// Gets or Sets Comments
        /// </summary>
        [DataMember(Name = "comments", IsRequired = true, EmitDefaultValue = true)]
        public List<Object> Comments { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class CoreCommentDeleteCommentsRequest {\n");
            sb.Append("  Comments: ").Append(Comments).Append("\n");
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