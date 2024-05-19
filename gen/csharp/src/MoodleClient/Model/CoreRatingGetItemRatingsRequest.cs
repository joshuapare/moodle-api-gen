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
    /// CoreRatingGetItemRatingsRequest
    /// </summary>
    [DataContract(Name = "core_rating_get_item_ratings_request")]
    public partial class CoreRatingGetItemRatingsRequest : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CoreRatingGetItemRatingsRequest" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected CoreRatingGetItemRatingsRequest() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="CoreRatingGetItemRatingsRequest" /> class.
        /// </summary>
        /// <param name="component">component (required).</param>
        /// <param name="contextlevel">context level: course, module, user, etc... (required).</param>
        /// <param name="instanceid">the instance id of item associated with the context level (required).</param>
        /// <param name="itemid">associated id (required).</param>
        /// <param name="ratingarea">rating area (required).</param>
        /// <param name="scaleid">scale id (required).</param>
        /// <param name="sort">sort order (firstname, rating or timemodified) (required) (default to &quot;null&quot;).</param>
        public CoreRatingGetItemRatingsRequest(string component = default(string), string contextlevel = default(string), int instanceid = default(int), int itemid = default(int), string ratingarea = default(string), int scaleid = default(int), string sort = @"null")
        {
            // to ensure "component" is required (not null)
            if (component == null)
            {
                throw new ArgumentNullException("component is a required property for CoreRatingGetItemRatingsRequest and cannot be null");
            }
            this.Component = component;
            // to ensure "contextlevel" is required (not null)
            if (contextlevel == null)
            {
                throw new ArgumentNullException("contextlevel is a required property for CoreRatingGetItemRatingsRequest and cannot be null");
            }
            this.Contextlevel = contextlevel;
            this.Instanceid = instanceid;
            this.Itemid = itemid;
            // to ensure "ratingarea" is required (not null)
            if (ratingarea == null)
            {
                throw new ArgumentNullException("ratingarea is a required property for CoreRatingGetItemRatingsRequest and cannot be null");
            }
            this.Ratingarea = ratingarea;
            this.Scaleid = scaleid;
            // to ensure "sort" is required (not null)
            if (sort == null)
            {
                throw new ArgumentNullException("sort is a required property for CoreRatingGetItemRatingsRequest and cannot be null");
            }
            this.Sort = sort;
        }

        /// <summary>
        /// component
        /// </summary>
        /// <value>component</value>
        [DataMember(Name = "component", IsRequired = true, EmitDefaultValue = true)]
        public string Component { get; set; }

        /// <summary>
        /// context level: course, module, user, etc...
        /// </summary>
        /// <value>context level: course, module, user, etc...</value>
        [DataMember(Name = "contextlevel", IsRequired = true, EmitDefaultValue = true)]
        public string Contextlevel { get; set; }

        /// <summary>
        /// the instance id of item associated with the context level
        /// </summary>
        /// <value>the instance id of item associated with the context level</value>
        [DataMember(Name = "instanceid", IsRequired = true, EmitDefaultValue = true)]
        public int Instanceid { get; set; }

        /// <summary>
        /// associated id
        /// </summary>
        /// <value>associated id</value>
        [DataMember(Name = "itemid", IsRequired = true, EmitDefaultValue = true)]
        public int Itemid { get; set; }

        /// <summary>
        /// rating area
        /// </summary>
        /// <value>rating area</value>
        [DataMember(Name = "ratingarea", IsRequired = true, EmitDefaultValue = true)]
        public string Ratingarea { get; set; }

        /// <summary>
        /// scale id
        /// </summary>
        /// <value>scale id</value>
        [DataMember(Name = "scaleid", IsRequired = true, EmitDefaultValue = true)]
        public int Scaleid { get; set; }

        /// <summary>
        /// sort order (firstname, rating or timemodified)
        /// </summary>
        /// <value>sort order (firstname, rating or timemodified)</value>
        [DataMember(Name = "sort", IsRequired = true, EmitDefaultValue = true)]
        public string Sort { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class CoreRatingGetItemRatingsRequest {\n");
            sb.Append("  Component: ").Append(Component).Append("\n");
            sb.Append("  Contextlevel: ").Append(Contextlevel).Append("\n");
            sb.Append("  Instanceid: ").Append(Instanceid).Append("\n");
            sb.Append("  Itemid: ").Append(Itemid).Append("\n");
            sb.Append("  Ratingarea: ").Append(Ratingarea).Append("\n");
            sb.Append("  Scaleid: ").Append(Scaleid).Append("\n");
            sb.Append("  Sort: ").Append(Sort).Append("\n");
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
