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
    /// CoreBlockGetCourseBlocksRequest
    /// </summary>
    [DataContract(Name = "core_block_get_course_blocks_request")]
    public partial class CoreBlockGetCourseBlocksRequest : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CoreBlockGetCourseBlocksRequest" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected CoreBlockGetCourseBlocksRequest() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="CoreBlockGetCourseBlocksRequest" /> class.
        /// </summary>
        /// <param name="courseid">course id (required) (default to null).</param>
        /// <param name="returncontents">Whether to return the block contents. (default to false).</param>
        public CoreBlockGetCourseBlocksRequest(int courseid = null, bool returncontents = false)
        {
            this.Courseid = courseid;
            this.Returncontents = returncontents;
        }

        /// <summary>
        /// course id
        /// </summary>
        /// <value>course id</value>
        [DataMember(Name = "courseid", IsRequired = true, EmitDefaultValue = true)]
        public int Courseid { get; set; }

        /// <summary>
        /// Whether to return the block contents.
        /// </summary>
        /// <value>Whether to return the block contents.</value>
        [DataMember(Name = "returncontents", EmitDefaultValue = true)]
        public bool Returncontents { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class CoreBlockGetCourseBlocksRequest {\n");
            sb.Append("  Courseid: ").Append(Courseid).Append("\n");
            sb.Append("  Returncontents: ").Append(Returncontents).Append("\n");
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