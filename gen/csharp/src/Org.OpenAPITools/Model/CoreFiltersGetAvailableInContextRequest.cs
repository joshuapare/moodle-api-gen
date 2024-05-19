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
    /// CoreFiltersGetAvailableInContextRequest
    /// </summary>
    [DataContract(Name = "core_filters_get_available_in_context_request")]
    public partial class CoreFiltersGetAvailableInContextRequest : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CoreFiltersGetAvailableInContextRequest" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected CoreFiltersGetAvailableInContextRequest() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="CoreFiltersGetAvailableInContextRequest" /> class.
        /// </summary>
        /// <param name="contexts">contexts (required).</param>
        public CoreFiltersGetAvailableInContextRequest(List<CoreFiltersGetAvailableInContextRequestContextsInner> contexts = default(List<CoreFiltersGetAvailableInContextRequestContextsInner>))
        {
            // to ensure "contexts" is required (not null)
            if (contexts == null)
            {
                throw new ArgumentNullException("contexts is a required property for CoreFiltersGetAvailableInContextRequest and cannot be null");
            }
            this.Contexts = contexts;
        }

        /// <summary>
        /// Gets or Sets Contexts
        /// </summary>
        [DataMember(Name = "contexts", IsRequired = true, EmitDefaultValue = true)]
        public List<CoreFiltersGetAvailableInContextRequestContextsInner> Contexts { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class CoreFiltersGetAvailableInContextRequest {\n");
            sb.Append("  Contexts: ").Append(Contexts).Append("\n");
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
