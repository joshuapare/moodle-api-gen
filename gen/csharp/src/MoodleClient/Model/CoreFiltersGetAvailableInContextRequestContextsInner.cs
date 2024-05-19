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
    /// CoreFiltersGetAvailableInContextRequestContextsInner
    /// </summary>
    [DataContract(Name = "core_filters_get_available_in_context_request_contexts_inner")]
    public partial class CoreFiltersGetAvailableInContextRequestContextsInner : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CoreFiltersGetAvailableInContextRequestContextsInner" /> class.
        /// </summary>
        /// <param name="contextlevel">The context level where the filters are:                                 (coursecat, course, module) (default to &quot;null&quot;).</param>
        /// <param name="instanceid">The instance id of item associated with the context. (default to null).</param>
        public CoreFiltersGetAvailableInContextRequestContextsInner(string contextlevel = @"null", int instanceid = null)
        {
            // use default value if no "contextlevel" provided
            this.Contextlevel = contextlevel ?? @"null";
            this.Instanceid = instanceid;
        }

        /// <summary>
        /// The context level where the filters are:                                 (coursecat, course, module)
        /// </summary>
        /// <value>The context level where the filters are:                                 (coursecat, course, module)</value>
        [DataMember(Name = "contextlevel", EmitDefaultValue = false)]
        public string Contextlevel { get; set; }

        /// <summary>
        /// The instance id of item associated with the context.
        /// </summary>
        /// <value>The instance id of item associated with the context.</value>
        [DataMember(Name = "instanceid", EmitDefaultValue = false)]
        public int Instanceid { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class CoreFiltersGetAvailableInContextRequestContextsInner {\n");
            sb.Append("  Contextlevel: ").Append(Contextlevel).Append("\n");
            sb.Append("  Instanceid: ").Append(Instanceid).Append("\n");
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
