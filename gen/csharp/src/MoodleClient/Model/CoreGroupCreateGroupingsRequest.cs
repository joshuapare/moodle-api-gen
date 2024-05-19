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
    /// CoreGroupCreateGroupingsRequest
    /// </summary>
    [DataContract(Name = "core_group_create_groupings_request")]
    public partial class CoreGroupCreateGroupingsRequest : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CoreGroupCreateGroupingsRequest" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected CoreGroupCreateGroupingsRequest() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="CoreGroupCreateGroupingsRequest" /> class.
        /// </summary>
        /// <param name="groupings">groupings (required).</param>
        public CoreGroupCreateGroupingsRequest(List<CoreGroupCreateGroupingsRequestGroupingsInner> groupings = default(List<CoreGroupCreateGroupingsRequestGroupingsInner>))
        {
            // to ensure "groupings" is required (not null)
            if (groupings == null)
            {
                throw new ArgumentNullException("groupings is a required property for CoreGroupCreateGroupingsRequest and cannot be null");
            }
            this.Groupings = groupings;
        }

        /// <summary>
        /// Gets or Sets Groupings
        /// </summary>
        [DataMember(Name = "groupings", IsRequired = true, EmitDefaultValue = true)]
        public List<CoreGroupCreateGroupingsRequestGroupingsInner> Groupings { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class CoreGroupCreateGroupingsRequest {\n");
            sb.Append("  Groupings: ").Append(Groupings).Append("\n");
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
