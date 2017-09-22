-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema riverdb
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS `riverdb` ;

-- -----------------------------------------------------
-- Schema riverdb
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `riverdb` DEFAULT CHARACTER SET utf8 ;
USE `riverdb` ;

-- -----------------------------------------------------
-- Table `river`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `river` ;

CREATE TABLE IF NOT EXISTS `river` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `county` VARCHAR(45) NULL,
  `name` VARCHAR(45) NULL,
  `stream_type` VARCHAR(55) NOT NULL,
  `image_url` VARCHAR(300) NULL,
  `fact` TEXT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;

SET SQL_MODE = '';
GRANT USAGE ON *.* TO riveruser@localhost;
 DROP USER riveruser@localhost;
SET SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';
CREATE USER 'riveruser'@'localhost' IDENTIFIED BY 'river';

GRANT SELECT, INSERT, TRIGGER, UPDATE, DELETE ON TABLE * TO 'riveruser'@'localhost';

SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;

-- -----------------------------------------------------
-- Data for table `river`
-- -----------------------------------------------------
START TRANSACTION;
USE `riverdb`;
INSERT INTO `river` (`id`, `county`, `name`, `stream_type`, `image_url`, `fact`) VALUES (1, 'La Plata County', 'Animas River', 'freestone', 'http://www.summitpost.org/images/original/830014.jpg', 'Insect hatches of aquatic diptera and mayflies occur in the winter and spring months. In late summer and through fall the Animas sees caddisfly and mayfly hatches as well as terrestrials such as grasshoppers. Animas trout average 12 to 16 inches (30 to 41 cm). Larger trout in the 17 to 22 inches (43 to 56 cm) are occasionally caught by anglers. Brown trout as large as 36 inches (91 cm) have been caught in the Animas.');
INSERT INTO `river` (`id`, `county`, `name`, `stream_type`, `image_url`, `fact`) VALUES (2, 'Lake County', 'Arkansas River', 'tailwater', 'http://wallpoop.com/wp-content/uploads/2012/07/riverside-park.jpg', 'The Arkansas River traverses about ninety miles between its headwaters above Leadville to the point where it rolls onto the prairie near Canon City. It flows through a high alpine meadow before it drops through steep canyons of granite boulders and finally courses through a high desert canyon. Populations of wild brown trout inhabit a river environment that teems with a variety of aquatic insects.');
INSERT INTO `river` (`id`, `county`, `name`, `stream_type`, `image_url`, `fact`) VALUES (3, 'Summit County', 'Blue River', 'tailwater', 'http://www.breckenridgewhitewater.com/wp-content/uploads/2015/05/blue_river__colorado_by_bmfa-d32z3ik.jpg', 'This is one of three tail waters in the state that has mysis shrimp (Frying Pan and Taylor Rivers). Mysis shrimp tumble through the river from the dam offering Blue River trout an easy meal. Mysis shrimp are the key ingredient to growing massive trout. Flies that imitate these shrimp should be a top choice for a Blue River angler.');
INSERT INTO `river` (`id`, `county`, `name`, `stream_type`, `image_url`, `fact`) VALUES (4, 'Grand County', 'Colorado River', 'freestone', 'http://rockfishstew.org/wp-content/uploads/2015/10/P1020313.jpg', 'The upper Colorado River is one of the most picturesque rivers in Colorado to fish. The river is lined with cottonwood trees which provide shelter for Bald Eagles. The  runs and deep pools that the upper Colorado River boasts hold very large wild Browns and Rainbows. The Colorado is a classic freestone that fishes well through out the year.');
INSERT INTO `river` (`id`, `county`, `name`, `stream_type`, `image_url`, `fact`) VALUES (5, 'Eagle County', 'Frying Pan RIver', 'tailwater/freestone', 'http://castingaround.anthonynaples.com/wp-content/uploads/2009/09/pan_view_01.JPG', 'The Frying Pan River is arguably one of Colorado\'s most popular rivers. This 42 mile long tributary of the Roaring Fork is home to some of the largest trout in the state but they do not typically come easy. The river offers anglers quite a bit of variety as it flows down stream. The higher you go towards the dam (14 miles from Basalt) the river fishes very much like a tailwater.');
INSERT INTO `river` (`id`, `county`, `name`, `stream_type`, `image_url`, `fact`) VALUES (6, 'Eagle County', 'Gore Creek', 'freestone', 'https://ssl.c.photoshelter.com/img-get2/I0000x5vCkULkfOE/fit=1000x750/Colorado-Vail-Gore-Creek-Running-Through-Vail.jpg', 'Gore Creek flows from high in the Gore Range to the east of Vail.  It originates at Gore Lake and flows to the confluence with the Eagle River at Dowd Junction just to the West of Vail.  This is a small freestone stream with excellent sight fishing. Fishing is best from the golf course in East Vail down to the Gold Medal stretch in West Vail and the confluence with the Eagle River.');
INSERT INTO `river` (`id`, `county`, `name`, `stream_type`, `image_url`, `fact`) VALUES (7, 'Gunnison County', 'Gunnison River', 'tailwater', 'http://www.americansouthwest.net/colorado/photographs700/long-draw-gunnison-river.jpg', 'The Black Canyon of the Gunnison River is arguably one of the most scenic and wild places in the state of Colorado. This river is best fished by float fishing in a raft with an experienced outfitter. This is a Gold Medal rated river full of large Brown and Rainbow trout.');
INSERT INTO `river` (`id`, `county`, `name`, `stream_type`, `image_url`, `fact`) VALUES (8, 'Jackson County', 'North Platte River', 'freestone', 'http://www.summitpost.org/images/original/616396.jpg', 'This freestone fishery begins in North Park Colorado at the confluence of Grizzly and Little Grizzly Creek and flows north into Wyoming picking up several other small streams along the way. The North Platte continues north through Wyoming over 300 miles before it heads east and reaches the Nebraska border. On its travels the characteristics of the river change dramatically from a deep canyons with tight narrow runs to wide meandering flats in the lower pasture and high desert sections. The 60 miles between the Routt access and the town of Saratoga is all considered a Blue Ribbon trout fishery and has not been stocked since 1979.');
INSERT INTO `river` (`id`, `county`, `name`, `stream_type`, `image_url`, `fact`) VALUES (9, 'Mineral County', 'Rio Grande River', 'freestone', 'http://hqworld.net/gallery/data/media/105/https://upload.wikimedia.org/wikipedia/commons/9/9c/Rio_grande_below_Creede_CO.jpg', 'The Rio Grande is the second longest river in the United States. It gets its start high in the San Juan mountains of Southern Colorado and is home to Rainbow and Brown trout. This freestone has abundant bug life and is particularly popular to float fish.');
INSERT INTO `river` (`id`, `county`, `name`, `stream_type`, `image_url`, `fact`) VALUES (10, 'Eagle County', 'Roaring Fork River', 'freestone', 'http://hqworld.net/gallery/data/media/105/roaring_fork_river__white_river_national_forest__colorado.jpg', 'The Roaring Fork is another one of Colorado\'s most famous freestone rivers. This major tributary of the Colorado River begins near the town of Aspen and runs hard for approximately 70 miles before it reaches the Colorado River in Glenwood Springs. Fishing can be outstanding for the entire length of the river and anglers are offered the opportunity to fish a variety of conditions as it grows in size heading towards the Colorado.');
INSERT INTO `river` (`id`, `county`, `name`, `stream_type`, `image_url`, `fact`) VALUES (11, 'Jefferson County', 'South Platte River', 'tailwater', 'https://c2.staticflickr.com/4/3669/12866557143_2854c164f2_b.jpg', 'The river holds approximately 3000 fish per mile and sight fishing opportunities abound. If solitude is a necessity of your fishing then don\'t head here. This stretch of river is very popular for a variety of reasons but dealing with the crowds can result in some truly amazing catches.');

COMMIT;

